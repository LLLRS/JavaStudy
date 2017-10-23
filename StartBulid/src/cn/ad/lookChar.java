package cn.ad;

import java.util.ArrayList;


/*====第十五题==================================
在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，
如果存在，则返回这个字符在字符数组中第一次出现的位置（序号从0开始计算），
否则，返回-1。要搜索的字符数组和字符都以参数形式传递传递给该方法，
如果传入的数组为null，应抛出IllegalArgumentException异常。
在类的main方法中以各种可能出现的情况测试验证该方法编写得是否正确，
例如，字符不存在，字符存在，传入的数组为null等。 
*/

public class lookChar {

	public static void main(String[] args) {
		
	
		char[] arr = {'a','b','c','e','k','o'};

		char ch = 'f';
		
		int i = lookMethod(ch,arr);

		System.out.println(i);
	}

	public static int lookMethod(char ch,char arr[]) {
		if(arr==null) 
			throw new RuntimeException("IllegalArgumentException");
		
		ArrayList<Character> sb = new ArrayList<>();
		
		for(char s:arr)
			sb.add(s);
		
		return sb.indexOf(ch);
	}

}
