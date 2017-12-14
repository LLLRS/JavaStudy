package com.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



//map的两种遍历方式：keySet()  entrySet()

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("1", "abc1");
		map.put("2", "abc2");
		map.put("3", "abc3");
		map.put("4", "abc4");
		
		//keySet
		Set<String> set = map.keySet();
		for(String key: set){
			System.out.println(key+"-----"+map.get(key));
		}
		System.out.println("-----------------------");
		//entrySet
		Set<Map.Entry<String,String>> se = map.entrySet();
		for(Map.Entry<String,String> me:se){
			System.out.println(me.getKey()+"-----"+me.getValue());
		}
		
	}

}
