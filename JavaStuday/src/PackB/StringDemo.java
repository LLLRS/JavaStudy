package PackB;
/*
 * String �����������ַ���
 * ������
 * 	1.��ȡ
 * 		1.1���� int length()
 * 		1.2��ȡ�ض�λ���ϵ��ַ� char charAt
 * 		1.3�����ַ���λ�� indexOf(int ch,int fromIndex)
 * 	2.�ж�
 * 		2.1�Ƿ����һ���ִ� boolean contains(CharSequence s)
 * 		2.2�Ƿ�������
 * 		2.3�Ƿ���ָ�����ݿ�ͷboolean startsWith(String prefix)
 * 		2.4�Ƿ���ָ�����ݽ�β boolean endsWith(String suffix)
 *  4.�滻
 * 
 *  5.�и�
 *  	 String[] split(String regex)
 *  	���磬�ַ��� "boo:and:foo" ��������������Щ���ʽ�Ľ���� 
		Regex ��� 
		: { "boo", "and", "foo" } 
		o { "b", "", ":and:f" }   
 *	6.�ִ�����ȡ�ַ�����һ����
 *		String substring(int beginIndex)
 *		String substring(int beginIndex,int endIndex) 
 *	7.ת����ȥ���ո񣬱Ƚ�
 *		7.1���ַ���ת��Ϊ��Сд
 *			String toUpperCase()
 *			String toLowerCase()
 *      7.2ȥ�����˵Ŀո�
 *      	String trim()
 *      7.3�Ƚ�
 *			int compareTo(String anotherString) //����Ƚ�
 * */
public class StringDemo {
	
	public static void method_is() {
		
		String str = "ArryDemo.java";
		//��Arry��ͷ
		sop(str.startsWith("Arry"));
		//��.java��β
		sop(str.endsWith(".java")); //��ҪԽ��
		//����Demo
		sop(str.contains("Demo"));
		
	}
	
	public static void method_get() {
		
		String str = "asdfghaw";
		//����
		sop(str.length());
		//����������λ��
		sop(str.charAt(3)); //��ҪԽ��
		//����λ��������
		sop(str.indexOf('a'));
		sop(str.indexOf('a',3));
		sop(str.indexOf('m'));//���δ���ָ��ַ����򷵻� -1��
		//��������
		sop(str.lastIndexOf('a'));
		
	}
	public static void main(String[] args) {
		
		String s1 = "abc"; //s1��һ�������ͱ�����"abc"��һ������
		
		String s2 = new String("abc");
		
		String s3 = "abc";
		/*����
		 *  s1���ڴ���ֻ��һ������
		 *  s2���ڴ�������������
		 * */
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//String�и�д��equals�������������ж��ַ����Ƿ���ͬ
		System.out.println(s1==s3);
		
		method_get();
		method_is();
	}
	
	public static void sop(Object obj) {
		
		System.out.println(obj);
	}

}
