package com.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*	ArrayListÇ¶Ì×HashMap
	HashMapÇ¶Ì×HashMapÇ¶Ì×HashMap(Èı²ãÇ¶Ì×)
*/
public class HashMapTest {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> arr = new ArrayList<>();
		
		HashMap<String,String> tm1 = new HashMap<>();
		tm1.put("1", "abc1");
		tm1.put("2", "abc2");
		tm1.put("3", "abc3");
		tm1.put("4", "abc4");
		
		HashMap<String,String> tm2 = new HashMap<>();
		tm2.put("111", "abc1");
		tm2.put("222", "abc2");
		tm2.put("333", "abc3");
		tm2.put("444", "abc4");
		
		arr.add(tm1);
		arr.add(tm2);
		
		for(HashMap<String,String> hm :arr){
			Set<String> set = hm.keySet();
			
			for(String s : set){
				
				System.out.println(s+"---"+hm.get(s));
			}
			
			
		}
	}

}
