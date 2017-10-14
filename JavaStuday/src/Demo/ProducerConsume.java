package Demo;
/*
 * 再次改进
 * notifyAll的用法
 * */

class Res{
	
	private String name;
	private int count = 1;
	private boolean flag = false;//写入供货者读出标记

	public synchronized void set(String name) {
		while(this.flag)
			try {this.wait();} catch(Exception e) {}
		
		this.name = name+"--"+count++;
		
		System.out.println(Thread.currentThread().getName()+
	              "..生产者.."+this.name);
		
		this.flag = true;
		    this.notifyAll();
	}
	public synchronized void out() {
		while(!this.flag)
			try {this.wait();} catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName()+
				              "....消费者...."+this.name);
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
				r.set("商品");
			
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

