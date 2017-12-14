package com.day17;

import java.util.TreeSet;
import java.util.Comparator;
/* TreeSet的构造器排序法
 * 		1.自定义一个实现cpmparator接口的具体子类
 * 		2.匿名内部类
 * 
 *	定义一个学生类，按照姓名的长度排序
*/

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//自定义一个实现cpmparator接口的具体子类
		//TreeSet<Person> ts = new TreeSet<>(new compareByLength());
		
		//匿名内部类
		TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>(){			
			@Override
			public int compare(Person p1, Person p2) {
				//年龄长度 --> 姓名 --> 年龄
				int temp1 = p1.getName().length()-p2.getName().length();
				int temp2 = (temp1==0?p1.getName().compareTo(p2.getName()):temp1);
				
				return temp2==0?p1.getAge()-p2.getAge():temp2;
			}

		});
		
		// 创建元素
		Person s1 = new Person("linqingxia", 27);
		Person s2 = new Person("zhangguorong", 29);
		Person s3 = new Person("wanglihong", 23);
		Person s4 = new Person("linqingxia", 27);
		Person s5 = new Person("liushishi", 22);
		Person s6 = new Person("wuqilong", 40);
		Person s7 = new Person("fengqingy", 22);
		Person s8 = new Person("linqingxia", 29);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// 遍历
		for (Person s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
