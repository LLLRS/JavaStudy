package collection.demo;

import java.util.Iterator;
import java.util.TreeSet;

import collection.demo.ComparatorByName;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//以字符串长度排序
		StringArray();
		
		//以Person对象年龄进行从小到大的排序。
		//PersonArray();
	
	}



	public static void PersonArray() {
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		
		ts.add(new Person("zhangsan",28));
		ts.add(new Person("lisi",21));
		ts.add(new Person("zhouqi",29));
		ts.add(new Person("zhaoliu",25));
		ts.add(new Person("wangu",24));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()){
			Person p = it.next();
			
			System.out.println(p.getName()+":"+p.getAge());
		}
	}



	public static void StringArray() {
		
		TreeSet<String> ts = new TreeSet<String>(new ComparatorByLength());
		
		ts.add("abcbbb");
		ts.add("za");
		ts.add("aawww");
		ts.add("nba");
		ts.add("ca");
		
		Iterator<String> it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}



}
