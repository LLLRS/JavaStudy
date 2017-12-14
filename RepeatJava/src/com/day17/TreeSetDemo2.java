package com.day17;

import java.util.TreeSet;
import java.util.Comparator;
/* TreeSet�Ĺ���������
 * 		1.�Զ���һ��ʵ��cpmparator�ӿڵľ�������
 * 		2.�����ڲ���
 * 
 *	����һ��ѧ���࣬���������ĳ�������
*/

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//�Զ���һ��ʵ��cpmparator�ӿڵľ�������
		//TreeSet<Person> ts = new TreeSet<>(new compareByLength());
		
		//�����ڲ���
		TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>(){			
			@Override
			public int compare(Person p1, Person p2) {
				//���䳤�� --> ���� --> ����
				int temp1 = p1.getName().length()-p2.getName().length();
				int temp2 = (temp1==0?p1.getName().compareTo(p2.getName()):temp1);
				
				return temp2==0?p1.getAge()-p2.getAge():temp2;
			}

		});
		
		// ����Ԫ��
		Person s1 = new Person("linqingxia", 27);
		Person s2 = new Person("zhangguorong", 29);
		Person s3 = new Person("wanglihong", 23);
		Person s4 = new Person("linqingxia", 27);
		Person s5 = new Person("liushishi", 22);
		Person s6 = new Person("wuqilong", 40);
		Person s7 = new Person("fengqingy", 22);
		Person s8 = new Person("linqingxia", 29);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// ����
		for (Person s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
