package collection.demo;

import java.util.HashSet;
import java.util.Iterator;
/*
 * ��haset�д洢Person�������������������ͬ����Ϊͬһ��
 * 
 * */
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Person> hs = new HashSet<Person>();
		
		hs.add(new Person("lisi",21));
		hs.add(new Person("lisi1",2));
		hs.add(new Person("zhansan",21));
		hs.add(new Person("lisi",21));
		
		Iterator<Person> it = hs.iterator();
		
		while(it.hasNext()){
			Person p = it.next();
			p.show();
		}
	}

}
