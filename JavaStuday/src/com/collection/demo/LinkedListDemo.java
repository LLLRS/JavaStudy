package collection.demo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
			
		LinkedList<String> l = new LinkedList<String>();
		show(l);
	}

	public static void show( LinkedList<String> l) {
		
		l.add("abc1");
		l.add("abc2");
		l.add("abc3");
		
        System.out.println(l);
        
        l.addFirst("first");
        System.out.println(l);
        
        l.addLast("end");
        System.out.println(l);
        
        l.removeFirst();
        System.out.println(l);
        
        l.removeLast();
        System.out.println(l);
        
        System.out.println("getFirst: "+l.getFirst());
        
        System.out.println("getLast: "+l.getLast());
        
	}

}
