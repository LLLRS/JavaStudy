package com.day13;
/*
 * 判断一个字符串是否是对称字符串
	例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串

 * 
 * */
public class StringBufferTest1 {

	public static void main(String[] args) {
		String s= "absba2";
		
		StringBuffer sb = new StringBuffer(s);
		
		String s2 = sb.reverse().toString();
		
		if(s.equals(s2))
			System.out.println(s+"是对称串");
		else
			System.out.println(s+"不是对称串");
 		
		
	}

}
