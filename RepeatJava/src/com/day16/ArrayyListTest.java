package com.day16;

import java.util.ArrayList;
import java.util.Iterator;


/*ArrayList
	1.去除集合中字符串的重复值(字符串的内容相同)
	2.去除集合中自定义对象的重复值(对象的成员变量值都相同)
*/
public class ArrayyListTest {

	public static void main(String[] args) {
//		1.去除集合中字符串的重复值
//		removeRepateElement();
//		2.去除集合中自定义对象的重复值
		removeRepateObject();
		
	}

	public static void removeRepateObject() {
		ArrayList a = new ArrayList();
		
		a.add(new Student("张三",21));
		a.add(new Student("李四",22));
		a.add(new Student("王五",23));
		a.add(new Student("张三",21));
		a.add(new Student("李四",23));
		a.add(new Student("王五",23));


		System.out.println("去除前：  "+a);
		ArrayList t = new ArrayList();
		Iterator it =  a.iterator();
		
		Student s = null;
		while(it.hasNext()){
			s = (Student)it.next();
			if(!t.contains(s)){
				t.add(s);
			}
			
		}
		System.out.println("去除后：  "+t);
	}

	public static void removeRepateElement() {
		ArrayList a = new ArrayList();
		
		a.add("java");
		a.add("hello");
		a.add("java");
		a.add("word");
		a.add("hello");

		System.out.println("去除前：  "+a);
		ArrayList t = new ArrayList();
		Iterator it =  a.iterator();
		String s = null;
		while(it.hasNext()){
			s = (String)it.next();
			if(!t.contains(s)){
				t.add(s);
			}
			
		}
		System.out.println("去除后：  "+t);
	}

}
