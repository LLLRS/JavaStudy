package com.day12;
/**
 * 将一个字符串的首字母变大写，其余变小写.
 * 
 * 思路：先拆分成两个串，转换后在合并
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
		
		
//		简化
		s = s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
		int t = s.compareTo("qq");
		System.out.println(s);

	}

}
