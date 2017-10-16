package cn.basedemo.packa;
/*
 * �����߳�
 * 1.�̳�Thread��
 * 		������̳�thread
 * 		��дrun����-���洢�߳����еĴ���
 * 		����start����:�����̣߳�����run����
 *  
 *  2.ʵ�� Runnable�ӿ�
 *  	������ʵ�� Runnable�ӿ�
 *  	ʵ�� run����
 *		ͨ��Thread�����̶߳���
 *		��Runnable�ӿڵ����������Ϊʵ�ʲ����ߵݸ�Thread��Ĺ��캯��
 *		����Thread���start��������Runnable�ӿ�����run����
 *
 *	һ���Ƽ�ʹ�õڶ���
 * */

class Method1 extends Thread{
	
	Method1(String name){		
		super(name);
	}
	
	public void run() {
		for(int x = 0;x<=60;x++)
			System.out.println(this.getName()+"---Demo Run---"+x);
		//stop();
		//sleep(1000);
		//for(int x = 0;x<=60;x++)
		//	 System.out.println("---Demo Run1---"+x);
	}
	
}

class Method2 implements Runnable {
    
    private int tick = 100; 
    public  synchronized void run() {
    
    	show();
    }
    
    public  synchronized  void show() {
    	
        while(tick>0){
   			 try{Thread.sleep(10);} catch(Exception e) {}
   			 System.out.println(Thread.currentThread().getName()+"--Sale Tick---"+tick--);
   		}  
    }
}

public class ThreadDemo {
	public static void main(String[] args) {	
		Method1 d1 = new Method1("one");
		d1.start();//start�����̣߳�������run����
		////d.run(); 
		
		Method2 d2 = new Method2();
		
		Thread  t1 = new Thread(d2);
		Thread  t2 = new Thread(d2);
		Thread  t3 = new Thread(d2);
		Thread  t4 = new Thread(d2);

		t1.start();
		t2.start();
		t3.start();
		t4.start();


		//�����߳� ����cpu��ִ��Ȩ��ĳһʱ��ֻ��һ�������У�˭����˭ִ�У�����ԣ�
		//for(int x = 0;x<=60;x++)
		//	 System.out.println("Hello Run-----"+x);
		
		
	}

}
