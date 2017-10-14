package Demo;
/*
 * �ٴθĽ�
 * notifyAll���÷�
 * */

class Res{
	
	private String name;
	private int count = 1;
	private boolean flag = false;//д�빩���߶������

	public synchronized void set(String name) {
		while(this.flag)
			try {this.wait();} catch(Exception e) {}
		
		this.name = name+"--"+count++;
		
		System.out.println(Thread.currentThread().getName()+
	              "..������.."+this.name);
		
		this.flag = true;
		    this.notifyAll();
	}
	public synchronized void out() {
		while(!this.flag)
			try {this.wait();} catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName()+
				              "....������...."+this.name);
		this.flag = false;
			this.notifyAll();
			    
	}
}

class Producer implements Runnable{
	
	private Res r;
	
	Producer(Res r){
		this.r = r;
	}
	public void run() {

		while(true) {
				r.set("��Ʒ");
			
		}
	}
}

class Consumer implements Runnable{
	
	private Res r;
	Consumer(Res r){
		this.r = r;
	}
	
	public void run() {
		while(true) {
			r.out();
		   }
		}
}


class ProducerConsumer {
	public static void main(String[] args) {	
		
		Res r = new Res();
		
		Producer  pro = new Producer(r);
		Consumer  con = new Consumer (r);
		
		Thread  t1 = new Thread(pro);
		Thread  t2 = new Thread(pro);
		
		Thread  t3 = new Thread(con);
		Thread  t4 = new Thread(con);
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

