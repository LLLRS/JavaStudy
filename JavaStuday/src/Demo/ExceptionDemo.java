package Demo;
/*
 * ��ʦ�õ����Ͽ�
 * 
 * �쳣��
 *    ����������ð��
 *    
 * �쳣������䣺���ָ�ʽ
 *  try catch finally
 *  try catch 
 *  try finally
 *  catch�����������쳣�ģ�û��catch�ͱ����ں���������
 *  
 *  ע�⣺
 *     1.����̳и���ʱ������ֻ���׳�������쳣���߸��쳣������
 *     2.���෽���׳�����쳣������ֻ���׳��쳣���Ӽ���
 *     3.����û���쳣�׳���������Բ������׳��쳣
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
			throw new LanPingException("����");
		if(state==3)
			throw new MaoYanException("ð��");
		
		System.out.println("��������");
	}
	
	public void reset() {
		System.out.println("��������");
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
			 throw new NoPlanException("�޷��Ͽ�"+e.getMessage());
		}
		
		System.out.println("��ʼ�Ͽ�");
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
			System.out.println("������");
			// return;
			//System.exit(0);  //finally ��ִ��
		}
		finally {
			System.out.println("finally");//��������һ���ᱻִ��
		}
	}

}
