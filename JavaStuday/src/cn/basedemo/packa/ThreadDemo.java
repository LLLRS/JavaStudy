package cn.basedemo.packa;
/*
 * 创建线程
 * 1.继承Thread类
 * 		定义类继承thread
 * 		复写run方法-》存储线程运行的代码
 * 		调用start方法:启动线程，调用run方法
 *  
 *  2.实现 Runnable接口
 *  	定义类实现 Runnable接口
 *  	实现 run方法
 *		通过Thread建立线程对象
 *		将Runnable接口的子类对象作为实际参数踹递给Thread类的构造函数
 *		调用Thread类的start方法调用Runnable接口子类run方法
 *
 *	一般推荐使用第二种
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
		d1.start();//start开启线程，并调用run方法
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


		//两个线程 抢夺cpu的执行权，某一时刻只有一个在运行，谁抢到谁执行（随机性）
		//for(int x = 0;x<=60;x++)
		//	 System.out.println("Hello Run-----"+x);
		
		
	}

}
