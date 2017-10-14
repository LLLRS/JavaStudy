package collection.demo;

import java.util.Comparator;



/**
 * 创建了一个根据Person类的name进行排序的比较器。
 */
public class ComparatorByName implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {


		
		int temp = p1.getName().compareTo(p2.getName());
		
		return temp==0?p1.getAge()-p2.getAge(): temp;
//		return 1;//有序。
	}

}
