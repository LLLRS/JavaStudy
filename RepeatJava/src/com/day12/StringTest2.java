package com.day12;
/*
 * 字符串反转
	举例：输入”abc”		
		   输出结果：”cba
 * */
public class StringTest2 {

	public static void main(String[] args) {
		String s = "abc;id";
		
		String t = "";
		for(int i=0;i<s.length();i++){
			t +=s.charAt(s.length()-i-1);
			
		}
		System.out.println(t); 
		//方法2：利用tCharArray();
		
		//方法#：Stringbufffer 
		StringBuffer sb = new StringBuffer();
		String ss = sb.append(s).reverse().toString();
		System.out.println(ss);
	}

}
