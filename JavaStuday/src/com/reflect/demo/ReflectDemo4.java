package reflect.demo;

//��ȡ�����еķ���
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public ReflectDemo4() {
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		getMethodDemo_2();
		
	}
	
	

	public static void getMethodDemo_3() throws Exception {
		
		Class clazz = Class.forName("com.reflect.demo.Person");
		
		Method method = clazz.getMethod("paramMethod", String.class,int.class);
		
		Object obj = clazz.newInstance();
		
		method.invoke(obj, "Сǿ",89);
		
		
	}

	public static void getMethodDemo_2() throws Exception {
		
		Class clazz = Class.forName("com.reflect.demo.Person");
		
		Method method = clazz.getMethod("show", null);//��ȡ�ղ���һ�㷽����
		
//		Object obj = clazz.newInstance();//Ĭ�ϳ�ʼ��
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		Object obj = constructor.newInstance("С��",37);
		
		
		method.invoke(obj, null);
		
		
		
	}

	/*
	 * ��ȡָ��Class�е����й���������
	 */
	public static void getMethodDemo_1() throws Exception {
		
		Class clazz = Class.forName("com.reflect.demo.Person");
		
		Method[] methods  = clazz.getMethods();//��ȡ�Ķ��ǹ��еķ����� 
		methods = clazz.getDeclaredMethods();//ֻ��ȡ���������з���������˽�С� 
		for(Method method : methods){
			System.out.println(method);
		}
		
		
	}

}
