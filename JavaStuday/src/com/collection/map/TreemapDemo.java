package collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import collection.demo.Person;
import collection.demo.ComparatorByName;

public class TreemapDemo {

	public static void main(String[] args) {
		TreeMap<Person,String> tm = new TreeMap<Person,String>(new ComparatorByName() );
		
		tm.put(new Person("zhangsan",21),"北京");
		tm.put(new Person("lisi",22),"杭州");
		tm.put(new Person("wangwu",28),"西安");
		tm.put(new Person("zhangsan",21),"河北");
		
		Set<Map.Entry<Person,String>>entrySet  = tm.entrySet();

		Iterator<Map.Entry<Person,String>> it = entrySet.iterator();
		
		while(it.hasNext()){
			Map.Entry<Person, String> me = it.next();
			Person p = me.getKey();
			String value = me.getValue();
			System.out.println(p.getName()+":"+p.getAge()+"---"+value);
			
		}
		
		
	}

}
