package collection.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/**
	 * LinkedHashSet可以保证有序唯一，链表
	 */
	public static void main(String[] args) {

		HashSet<String> hs = new LinkedHashSet<String>();
		
		hs.add("hahah");
		hs.add("hehe");
		hs.add("heihei");
		hs.add("xixii");
		hs.add("hehe");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
