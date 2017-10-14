package collection.demo;

import java.util.ArrayList;
import collection.demo.Person;
/*
 *  自定义Person对象。
 *	将多个Person对象存储到集合中。
 *	并取出。打印Person的姓名和年龄.
 * */


public class ArryaListDemo {

	public static void main(String[] args) {
		
		ArrayList<Person> arr = new ArrayList<Person>();
		
		//Person p1 = new Person("zhangsan");
		Person p2 = new Person("lisi",20);
		Person p3 = new Person("wangwu",12);
		
		//arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		
		show(arr);

	}

	public static void show(ArrayList<Person> arr) {
		
		//Person p = (Person) arr.get(2);
		for(int i =0;i<arr.size();i++)
			  arr.get(i).show();
	}
}
