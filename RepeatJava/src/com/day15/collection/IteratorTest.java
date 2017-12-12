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
		//whileʵ��
//		Iterator it = c.iterator();
//		while(it.hasNext()){
//			String s = (String)it.next();
//			
//			System.out.println(s.length());
//			
//		}
		//forʵ��
		Iterator it = c.iterator();
		for(;it.hasNext();){
			String s = (String)it.next();
			
			System.out.println(s.length());
			
		}
		//�ٶȿ죬��������������
		for(;it.hasNext();){
			String s = (String)it.next();
			
			System.out.println(s.length());
			
		}
	}

}
