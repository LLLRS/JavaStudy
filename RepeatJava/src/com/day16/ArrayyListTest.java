package com.day16;

import java.util.ArrayList;
import java.util.Iterator;


/*ArrayList
	1.ȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	2.ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
*/
public class ArrayyListTest {

	public static void main(String[] args) {
//		1.ȥ���������ַ������ظ�ֵ
//		removeRepateElement();
//		2.ȥ���������Զ��������ظ�ֵ
		removeRepateObject();
		
	}

	public static void removeRepateObject() {
		ArrayList a = new ArrayList();
		
		a.add(new Student("����",21));
		a.add(new Student("����",22));
		a.add(new Student("����",23));
		a.add(new Student("����",21));
		a.add(new Student("����",23));
		a.add(new Student("����",23));


		System.out.println("ȥ��ǰ��  "+a);
		ArrayList t = new ArrayList();
		Iterator it =  a.iterator();
		
		Student s = null;
		while(it.hasNext()){
			s = (Student)it.next();
			if(!t.contains(s)){
				t.add(s);
			}
			
		}
		System.out.println("ȥ����  "+t);
	}

	public static void removeRepateElement() {
		ArrayList a = new ArrayList();
		
		a.add("java");
		a.add("hello");
		a.add("java");
		a.add("word");
		a.add("hello");

		System.out.println("ȥ��ǰ��  "+a);
		ArrayList t = new ArrayList();
		Iterator it =  a.iterator();
		String s = null;
		while(it.hasNext()){
			s = (String)it.next();
			if(!t.contains(s)){
				t.add(s);
			}
			
		}
		System.out.println("ȥ����  "+t);
	}

}
