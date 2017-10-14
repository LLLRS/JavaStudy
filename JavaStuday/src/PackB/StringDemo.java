package PackB;
/*
 * String 类用于描述字符串
 * 方法：
 * 	1.获取
 * 		1.1长度 int length()
 * 		1.2获取特定位置上的字符 char charAt
 * 		1.3返回字符的位置 indexOf(int ch,int fromIndex)
 * 	2.判断
 * 		2.1是否包含一个字串 boolean contains(CharSequence s)
 * 		2.2是否有内容
 * 		2.3是否以指定内容开头boolean startsWith(String prefix)
 * 		2.4是否以指定内容结尾 boolean endsWith(String suffix)
 *  4.替换
 * 
 *  5.切割
 *  	 String[] split(String regex)
 *  	例如，字符串 "boo:and:foo" 产生带有下面这些表达式的结果： 
		Regex 结果 
		: { "boo", "and", "foo" } 
		o { "b", "", ":and:f" }   
 *	6.字串：获取字符串的一部分
 *		String substring(int beginIndex)
 *		String substring(int beginIndex,int endIndex) 
 *	7.转换。去除空格，比较
 *		7.1将字符串转换为大小写
 *			String toUpperCase()
 *			String toLowerCase()
 *      7.2去除两端的空格
 *      	String trim()
 *      7.3比较
 *			int compareTo(String anotherString) //涮旭比较
 * */
public class StringDemo {
	
	public static void method_is() {
		
		String str = "ArryDemo.java";
		//以Arry开头
		sop(str.startsWith("Arry"));
		//以.java结尾
		sop(str.endsWith(".java")); //不要越界
		//包含Demo
		sop(str.contains("Demo"));
		
	}
	
	public static void method_get() {
		
		String str = "asdfghaw";
		//长度
		sop(str.length());
		//根据索引找位置
		sop(str.charAt(3)); //不要越界
		//根据位置找索引
		sop(str.indexOf('a'));
		sop(str.indexOf('a',3));
		sop(str.indexOf('m'));//如果未出现该字符，则返回 -1。
		//反向索引
		sop(str.lastIndexOf('a'));
		
	}
	public static void main(String[] args) {
		
		String s1 = "abc"; //s1是一个类类型变量，"abc"是一个对象
		
		String s2 = new String("abc");
		
		String s3 = "abc";
		/*区别：
		 *  s1在内存中只有一个对象
		 *  s2在内存中有两个对象
		 * */
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//String中复写了equals方法。用于与判断字符串是否相同
		System.out.println(s1==s3);
		
		method_get();
		method_is();
	}
	
	public static void sop(Object obj) {
		
		System.out.println(obj);
	}

}
