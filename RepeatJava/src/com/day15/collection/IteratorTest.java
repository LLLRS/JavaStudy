package com.day15.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("wo");
		c.add("java");
		//while实现
//		Iterator it = c.iterator();
//		while(it.hasNext()){
//			String s = (String)it.next();
//			
//			System.out.println(s.length());
//			
//		}
		//for实现
		Iterator it = c.iterator();
		for(;it.hasNext();){
			String s = (String)it.next();
			
			System.out.println(s.length());
			
		}
		//速度快，且用完立即回收
		for(;it.hasNext();){
			String s = (String)it.next();
			
			System.out.println(s.length());
			
		}
	}

}
