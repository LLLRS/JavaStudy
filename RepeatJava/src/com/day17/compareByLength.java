package com.day17;

import java.util.Comparator;

public class compareByLength implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		//年龄长度 --> 姓名 --> 年龄
		int temp1 = p1.getName().length()-p2.getName().length();
		int temp2 = (temp1==0?p1.getName().compareTo(p2.getName()):temp1);
		
		return temp2==0?p1.getAge()-p2.getAge():temp2;
	}

}
