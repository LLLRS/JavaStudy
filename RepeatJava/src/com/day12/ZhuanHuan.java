package com.day12;
/**
 * ��һ���ַ���������ĸ���д�������Сд.
 * 
 * ˼·���Ȳ�ֳ���������ת�����ںϲ�
 */
public class ZhuanHuan {

	public static void main(String[] args) {
		String s = "jAVAsE";
		
//		String t1 = s.substring(0, 1);
//		String t2 = s.substring(1,s.length());
//		
//		s = t1.toUpperCase()+t2.toLowerCase();
//		
//		System.out.println(s);
		
		
//		��
		s = s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
		int t = s.compareTo("qq");
		System.out.println(s);

	}

}
