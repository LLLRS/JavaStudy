package com.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * 	���ܶ�㣬���ǵ��㣬��ע���ļ�ֵ����
 * 		keyset()�����ķ������;��Ǹü�ֵ������
 *    Ȼ��һ��㴦����
 * 
 * ���ǲ���
 * 		bj	����У��
 * 			jc	������
 * 					����ϼ		27
 * 					������		30
 * 			jy	��ҵ��	
 * 					����֥		28
 * 					����		29		
 * 		xa	����У��
 * 			jc	������
 * 					������		27
 * 					����		30
 * 			jy	��ҵ��	
 * 					�����		28
 * 					��־��		29
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// �����󼯺�
		HashMap<String, HashMap<String, ArrayList<Student>>> czbkMap = new HashMap<>();

		// ����У������
		HashMap<String, ArrayList<Student>> bjCzbkMap = new HashMap<>();
		ArrayList<Student> array1 = new ArrayList<>();
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		array1.add(s1);
		array1.add(s2);
		ArrayList<Student> array2 = new ArrayList<>();
		Student s3 = new Student("����֥", 28);
		Student s4 = new Student("����", 29);
		array2.add(s3);
		array2.add(s4);
		bjCzbkMap.put("������", array1);
		bjCzbkMap.put("��ҵ��", array2);
		czbkMap.put("����У��", bjCzbkMap);

		// ����У������
		HashMap<String, ArrayList<Student>> xaCzbkMap = new HashMap<>();
		ArrayList<Student> array3 = new ArrayList<>();
		Student s5 = new Student("������", 27);
		Student s6 = new Student("����", 30);
		array3.add(s5);
		array3.add(s6);
		ArrayList<Student> array4 = new ArrayList<>();
		Student s7 = new Student("�����", 28);
		Student s8 = new Student("��־��", 29);
		array4.add(s7);
		array4.add(s8);
		xaCzbkMap.put("������", array3);
		xaCzbkMap.put("��ҵ��", array4);
		czbkMap.put("����У��", xaCzbkMap);

		// ��������
		Set<String> czbkMapSet = czbkMap.keySet();
		for (String czbkMapKey : czbkMapSet) {
			System.out.println(czbkMapKey);
			HashMap<String, ArrayList<Student>> czbkMapValue = czbkMap.get(czbkMapKey);
			
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			
			for (String czbkMapValueKey : czbkMapValueSet) {
				System.out.println("\t" + czbkMapValueKey);
				ArrayList<Student> czbkMapValueValue = czbkMapValue
						.get(czbkMapValueKey);
				for (Student s : czbkMapValueValue) {
					System.out.println("\t\t" + s.getName() + "---"
							+ s.getAge());
				}
			}
		}
	}
}
