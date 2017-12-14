package com.day17;

import java.util.ArrayList;
import java.util.Iterator;

//集合的嵌套遍历:注意多层泛型的书写方式

public class ArryListTest {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("java1");
		a1.add("hello1");
		
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("java2");
		a2.add("hello2");
		
		ArrayList<ArrayList<String>> a3 = new ArrayList<>();
		a3.add(a1);
		a3.add(a2);
		
		for(ArrayList<String> t1 : a3){
//			System.out.println(t1);
			for(String t2 : t1){
				System.out.println(t2);
			}
		}
		
		Iterator<ArrayList<String>> it = a3.iterator();
		while(it.hasNext()){
			ArrayList<String> t = it.next();
			Iterator<String> it2 = t.iterator();
			while(it2.hasNext()){
				System.out.println(it2.next());
			}
//			System.out.println(t);
			
		}
		
	}

}
