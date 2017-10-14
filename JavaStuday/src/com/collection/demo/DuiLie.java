package collection.demo;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	DuiLie(){
		link = new  LinkedList();
	}
	
	public void myAdd(Object obj) {
		
		//link.addLast(obj);
		link.addFirst(obj);

	}
	public Object myGet() {
		
		return link.removeFirst();

	}
	
	public boolean mySize() {
		
		return link.isEmpty();
	}
	
}
