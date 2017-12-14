package com.day18;

import java.util.Set;
import java.util.TreeMap;

/*"aababcabcdabcde",获取字符串中每一个字母出现的次数
	要求结果:a(5)b(4)c(3)d(2)e(1)
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
//		判断的另一种思路
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
