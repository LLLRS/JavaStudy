package com.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * 	不管多层，还是单层，关注他的键值就行
 * 		keyset()方法的返回类型就是该键值的类型
 *    然后一层层处理即可
 * 
 * 传智播客
 * 		bj	北京校区
 * 			jc	基础班
 * 					林青霞		27
 * 					风清扬		30
 * 			jy	就业班	
 * 					赵雅芝		28
 * 					武鑫		29		
 * 		xa	西安校区
 * 			jc	基础班
 * 					范冰冰		27
 * 					刘意		30
 * 			jy	就业班	
 * 					李冰冰		28
 * 					张志豪		29
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// 创建大集合
		HashMap<String, HashMap<String, ArrayList<Student>>> czbkMap = new HashMap<>();

		// 北京校区数据
		HashMap<String, ArrayList<Student>> bjCzbkMap = new HashMap<>();
		ArrayList<Student> array1 = new ArrayList<>();
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		array1.add(s1);
		array1.add(s2);
		ArrayList<Student> array2 = new ArrayList<>();
		Student s3 = new Student("赵雅芝", 28);
		Student s4 = new Student("武鑫", 29);
		array2.add(s3);
		array2.add(s4);
		bjCzbkMap.put("基础班", array1);
		bjCzbkMap.put("就业班", array2);
		czbkMap.put("北京校区", bjCzbkMap);

		// 西安校区数据
		HashMap<String, ArrayList<Student>> xaCzbkMap = new HashMap<>();
		ArrayList<Student> array3 = new ArrayList<>();
		Student s5 = new Student("范冰冰", 27);
		Student s6 = new Student("刘意", 30);
		array3.add(s5);
		array3.add(s6);
		ArrayList<Student> array4 = new ArrayList<>();
		Student s7 = new Student("李冰冰", 28);
		Student s8 = new Student("张志豪", 29);
		array4.add(s7);
		array4.add(s8);
		xaCzbkMap.put("基础班", array3);
		xaCzbkMap.put("就业班", array4);
		czbkMap.put("西安校区", xaCzbkMap);

		// 遍历集合
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
