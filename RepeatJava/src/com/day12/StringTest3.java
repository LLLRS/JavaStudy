package com.day12;
/*
 *统计大串中小串出现的次数
 *	举例：在字符串” woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”中
 *	  java出现了5次
 *   
 * */
public class StringTest3 {

	public static void main(String[] args) {
		String s1 = "javawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String s2 = "java";
		//思路1：
//		int ch = -s2.length();
//		int count = 0;
//		while(true){
//			ch = s1.indexOf(s2, ch+s2.length());
//			if(ch==-1) break;
//			count++;	
//		}
//		System.out.println(s2+"出现的次数为："+count);
		
		// 思路2；
		int ch = 0;
		int count = 0;
		while((ch = s1.indexOf(s2))!=-1){
			count++;
			s1 = s1.substring(ch+s2.length());
				
		}
		System.out.println(s2+"出现的次数为："+count);
	}

}
