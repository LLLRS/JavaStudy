package com.day13;
/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
	����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���

 * 
 * */
public class StringBufferTest1 {

	public static void main(String[] args) {
		String s= "absba2";
		
		StringBuffer sb = new StringBuffer(s);
		
		String s2 = sb.reverse().toString();
		
		if(s.equals(s2))
			System.out.println(s+"�ǶԳƴ�");
		else
			System.out.println(s+"���ǶԳƴ�");
 		
		
	}

}
