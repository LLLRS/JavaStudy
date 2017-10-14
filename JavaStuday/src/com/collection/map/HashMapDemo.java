package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.demo.Person;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Person,String> hm = new HashMap<Person,String>();
		
		hm.put(new Person("zhangsan",21),"����");
		hm.put(new Person("lisi",22),"����");
		hm.put(new Person("wangwu",21),"����");
		hm.put(new Person("zhangsan",21),"�ӱ�");
		
		Set<Person> keyset = hm.keySet();
		Iterator<Person> it = keyset.iterator();
		
//		Iterator<Person> it = hm.keySet().iterator();
		
		while(it.hasNext()){
			Person key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		
	}

}
