package Demo;
/*
 * 老师用电脑上课
 * 
 * 异常：
 *    电脑蓝屏，冒烟
 *    
 * 异常处理语句：三种格式
 *  try catch finally
 *  try catch 
 *  try finally
 *  catch是用来处理异常的，没有catch就必须在函数上声明
 *  
 *  注意：
 *     1.子类继承父类时，子类只能抛出父类的异常或者该异常的子类
 *     2.父类方法抛出多个异常，子诶只能抛出异常的子集。
 *     3.父类没有异常抛出，子类绝对不可以抛出异常
 */
class LanPingException extends Exception{
	LanPingException(String message){
		
		super(message);
	}
		
}

class MaoYanException extends Exception{
	MaoYanException(String message){
		
		super(message);
	}
		
}

class NoPlanException extends Exception{
	NoPlanException(String message){
		
		super(message);
	}
		
}

class Computer {
	private int state = 3;
	public void run() throws LanPingException,MaoYanException {
		if(state==2)
			throw new LanPingException("蓝屏");
		if(state==3)
			throw new MaoYanException("冒烟");
		
		System.out.println("电脑运行");
	}
	
	public void reset() {
		System.out.println("电脑重启");
		state = 1;
	}
	
}

class Teacher {
	private String name;
	private Computer comp;
	
	Teacher(String name){
		this.name = name;
		comp = new Computer();	
	}
	public void start() throws NoPlanException{
		try {
		comp.run();
		}
		catch(LanPingException e) {
			comp.reset();
		}
		catch(MaoYanException e) {
			 throw new NoPlanException("无法上课"+e.getMessage());
		}
		
		System.out.println("开始上课");
	}
}


public class ExceptionDemo {
	public static void main(String[] args) {
	 
		Teacher t = new Teacher("lisi");
		
		////
		try{
			t.start();
		   }
		catch(NoPlanException e) {
			System.out.println(e.toString());
			System.out.println("换机器");
			// return;
			//System.exit(0);  //finally 不执行
		}
		finally {
			System.out.println("finally");//这个代码块一定会被执行
		}
	}

}
