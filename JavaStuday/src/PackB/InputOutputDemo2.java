package PackB;

/*
 * 对package PackB中InputOutputDemo代码的一个优化
 * */
class Res{
	
	private String name;
	private String sex;
	private boolean flag = false;//写入供货者读出标记

	public synchronized void set(String name,String sex) {
		if(this.flag)
			try {this.wait();} catch(Exception e) {}
		this.name = name;
		this.sex = sex;
		this.flag = true;
		    this.notify();
	}
	public synchronized void out() {
		if(!this.flag)
			try {this.wait();} catch(Exception e) {}
		System.out.println(this.name+"-----"+this.sex);
		this.flag = false;
			this.notify();
			    
	}
}

class Input implements Runnable{
	
	private Res r;
	
	Input(Res r){
		this.r = r;
	}
	public void run() {
		int x = 0;
		while(true) {
			
			if(x==0) 
				r.set("make","man");
			else
				r.set("张三","男");

			 x = (x+1)%2;	
		}
	}
}

class Output implements Runnable{
	
	private Res r;
	
	Output(Res r){
		this.r = r;
	}
	
	public void run() {
		while(true) {
			r.out();
		   }
		}
}


public class InputOutputDemo2 {
	public static void main(String[] args) {	
		
		Res r = new Res();
		
		Input  in = new Input(r);
		Output  out = new Output(r);
		
		Thread  t1 = new Thread(in);
		Thread  t2 = new Thread(out);
	
		t1.start();
		t2.start();
	}
}
