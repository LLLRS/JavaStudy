package waapper.demo;

	/* �����������Ͷ����װ�ࡣ
	* Ϊ�˷������������������ֵ�������װ���˶����ڶ����ж��������Ժ���Ϊ�ḻ�˸����ݵĲ�����
	* ���������ö������ͳ�Ϊ�����������Ͷ����װ�ࡣ
	* 
	* byte		Byte
	* short	Short
	* int		Integer
	* long		Long
	* float	Float
	* double	Double
	* char		Character
	* boolean	Boolean
	* 
	* �ð�װ������Ҫ�û������ͺ��ַ���֮���ת����
	* 
	* ��������--->�ַ���
	* 		1,����������ֵ+""
	* 		2,��String���еľ�̬����valueOf(����������ֵ);
	* 		3,��Integer�ľ�̬����valueO(����������ֵ);
	* 
	* �ַ���--->��������
	* 		1,ʹ�ð�װ���еľ�̬����   xxx parseXxx("xxx���͵��ַ���");*****
	* 			int parseInt("intstring");
	* 			long parseLong("longstring");
	* 			boolean parseBoolean("booleanstring");
	* 			ֻ��Characterû��parse���� 
	* 		2,����ַ�����Integer���ж���ķ�װ��
	* 			��ʹ����һ���Ǿ�̬�ķ�����intValue();
	* 			��һ��Integer����ת�ɻ�����������ֵ��
	* 
	* 
	*/




public class Wapperdemo {

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		
		//ʮ����ת��Ϊ��������
		System.out.println(Integer.toBinaryString(67));
		System.out.println(Integer.toOctalString(67));
		System.out.println(Integer.toHexString(67));
		
		System.out.println(Integer.toString(67,16));
		//��������ת��Ϊʮ����
		System.out.println(Integer.parseInt("67",16));
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		
		System.out.println(a==b);//��ͬ�洢�ռ�
		System.out.println(a.equals(b));
		
		System.out.println(a.compareTo(b));//-1 0 1
		//1.5�������� ���Զ�װ��
		
		Integer num = 4;// = new Integer(4);
		//i = i + 6;// i = new Integer(i.intValue() + 6); //i.intValue() �Զ�����
		
		Integer x = 129;//jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		Integer y = 129;
		System.out.println(x==y);//
		System.out.println(x.equals(y));//true
	}

}


