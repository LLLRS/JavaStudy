package com.day12;
/*
 * 寻找两个字符串的最长字串
 *  输入 abcdefghijklmnop
		abcsafjklmnopqrstuvw
	输出
		jklmnop
 **/
public class StringTest4 {

	public static void main(String[] args) {
		String s1 = "abcdefghijklmnop";
		String s2 = "abcsafjklmnopqrstuvw";

		String s = findLonString(s1, s2);
		
		System.out.println(s);
	}

	public static String findLonString(String s1, String s2) {
		String temp = null;
		//使得s1是两个传中较短的那个，减少比较次数
		if(s1.length()>s2.length()){
			temp = s1;
			s1 = s2;
			s2 = temp;		
		}
		
		for(int i=s1.length();i>=0;i--){
			for(int k=0;k<=s1.length()-i;k++){
				if(s2.contains(s1.substring(k,k+i))){
					
					return s1.substring(k,k+i);
				}
			}	
		}		
		return null;
	}
}
