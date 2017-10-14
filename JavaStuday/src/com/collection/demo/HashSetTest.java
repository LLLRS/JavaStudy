package collection.demo;

import java.util.HashSet;
import java.util.Iterator;
/*
 * 往haset中存储Person对象，如果姓名和年龄相同，视为同一个
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
