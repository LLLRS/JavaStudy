package Demo;
/*
 * ���ģʽ�����Ĥһ����������Ч�ķ���
 * 
 * �������ģʽ��һ�� �����ڴ���ֻ����һ������
 * 
 * ��֤Ψһ�ԣ�
 * 1.���������������������
 * 2.�ڱ������Զ���һ������
 * 3.�ṩһ���������Ի�ȡ���ö���
 * 
 * ���룺
 * 1.���캯��˽�л�
 * 2.�����д���һ���������
 * 3.�ṩһ������
 * 
 * */

class Single{
	//����ʽ
	private Single() {}
	private static Single s = new Single();
	public static Single getInstance() {
		return s;
	}
	/*����ʽ
	 * private static Single s = null;	
	 * private Single() {}
		public static Single getInstance() {
		if(s==null){
			synchronized(Single.class){ 
				if(s==null)
					s =  new Single(); 
				}
		}
		return s;
	}
	 * 
	 * */
	//��������� 
}

public class SingleDemo {
	public static void main(String[] args) {
		
		Single ss = Single.getInstance();
		
		System.out.println("bbbb");
		
	}

}
