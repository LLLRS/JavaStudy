package collection.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("hehe");
//		hs.add("heihei");
		hs.add("hahah");
		hs.add("xixii");
		hs.add("hehe");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
