package com.day18;

import java.util.Set;
import java.util.TreeMap;

/*"aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���
	Ҫ����:a(5)b(4)c(3)d(2)e(1)
*/

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Character,Integer> tm  = new TreeMap<>();
		
		String s = "aababcbbbabcdabcde";
		
		for(int i = 0;i<s.length();i++){
			char ch = s.charAt(i);
			
			if(tm.containsKey(ch))  
				tm.put(ch, tm.get(ch)+1);
			else  
				tm.put(ch,1);

		}
//		�жϵ���һ��˼·
//		for(int i = 0;i<s.length();i++){
		
//			char ch = s.charAt(i);
//			Integer i =  tm.get(ch);
//			
//			if(i == null)
//				tm.put(ch, 1);
//			else 			
//				tm.put(ch,i+1);
//		}
		
		Set<Character> set = tm.keySet();
		
//		for(char key:set){
//			System.out.println(key+"("+tm.get(key)+")");
//		}
		
		StringBuilder sb=  new StringBuilder();

		for(Character key : set){
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		
		
		String result = sb.toString();
		System.out.println("result:"+result);
	}

}
