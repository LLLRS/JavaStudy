package Demo;
/*
 * �������Բ�ͳ�����
 * ���С�ڵ����㣬�����쳣
 * 
 * 
 * */
interface shap{
	void getArea();
}

class NoValueException extends RuntimeException{
	NoValueException(String message){
		super(message);
	}
}

class Rec implements shap {
	private int len,wid;
	Rec(int len,int wid) throws NoValueException
	{
		if(len<=0 || wid<=0)
			throw new NoValueException("����Ƿ�ֵ");
		else {
			this.len = len;
			this.wid = wid;
		}
	}
	
	public void getArea() {
		System.out.println(len*wid);		
	}
}

class Cir implements shap {
	private int rad;
	public static final double PI = 3.14;
	Cir(int rad) //throws NoValueException
	{
		if(rad<=0)
			throw new NoValueException("����Ƿ�ֵ");
		else {
			this.rad = rad;
	
		}
	}
	
	public void getArea() {
		System.out.println(rad*rad*PI);		
	}
}
public class ExceptionTest {
	public static void main(String[] args) {		
		try {
			Rec r = new Rec(3,4);
			r.getArea();
		}
		catch(NoValueException e){
			System.out.println(e.toString());		
		}
		
		Cir c = new Cir(-3);
		c.getArea();
	}

}
