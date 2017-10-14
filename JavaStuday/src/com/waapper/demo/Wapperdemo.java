package waapper.demo;

	/* 基本数据类型对象包装类。
	* 为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作。
	* 用于描述该对象的类就称为基本数据类型对象包装类。
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
	* 该包装对象主要用基本类型和字符串之间的转换。
	* 
	* 基本类型--->字符串
	* 		1,基本类型数值+""
	* 		2,用String类中的静态方法valueOf(基本类型数值);
	* 		3,用Integer的静态方法valueO(基本类型数值);
	* 
	* 字符串--->基本类型
	* 		1,使用包装类中的静态方法   xxx parseXxx("xxx类型的字符串");*****
	* 			int parseInt("intstring");
	* 			long parseLong("longstring");
	* 			boolean parseBoolean("booleanstring");
	* 			只有Character没有parse方法 
	* 		2,如果字符串被Integer进行对象的封装。
	* 			可使用另一个非静态的方法，intValue();
	* 			将一个Integer对象转成基本数据类型值。
	* 
	* 
	*/




public class Wapperdemo {

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		
		//十进制转换为其他进制
		System.out.println(Integer.toBinaryString(67));
		System.out.println(Integer.toOctalString(67));
		System.out.println(Integer.toHexString(67));
		
		System.out.println(Integer.toString(67,16));
		//其他进制转换为十进制
		System.out.println(Integer.parseInt("67",16));
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		
		System.out.println(a==b);//不同存储空间
		System.out.println(a.equals(b));
		
		System.out.println(a.compareTo(b));//-1 0 1
		//1.5后新特性 ：自动装箱
		
		Integer num = 4;// = new Integer(4);
		//i = i + 6;// i = new Integer(i.intValue() + 6); //i.intValue() 自动拆箱
		
		Integer x = 129;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
		Integer y = 129;
		System.out.println(x==y);//
		System.out.println(x.equals(y));//true
	}

}


