package com.day12;
/*
 * �ַ�����ת
	���������롱abc��		
		   ����������cba
 * */
public class StringTest2 {

	public static void main(String[] args) {
		String s = "abc;id";
		
		String t = "";
		for(int i=0;i<s.length();i++){
			t +=s.charAt(s.length()-i-1);
			
		}
		System.out.println(t); 
		//����2������tCharArray();
		
		//����#��Stringbufffer 
		StringBuffer sb = new StringBuffer();
		String ss = sb.append(s).reverse().toString();
		System.out.println(ss);
	}

}
