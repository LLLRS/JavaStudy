package com.day16;

import java.util.LinkedList;

public class MyStack {
	
	private LinkedList list ;
	
	public MyStack() {
		list = new LinkedList();
	}
	
	public Object pop(){
		//removeFirst
		return list.removeFirst();
	}
	public void push(Object obj){
		//addFirst
		list.addFirst(obj);		
	}
	
	public boolean isEmpty(){
		
		return list.isEmpty();
	}

	
}
