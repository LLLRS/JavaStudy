package com.day16;
/*
 * LinkedList
	请用LinkedList模拟栈数据结构的集合，并测试
*/

public class LinkeLlistTest {

	public static void main(String[] args) {
		
		MyStack me = new MyStack();
		
		me.push("hello");
		me.push("java");
		me.push("word");
		
		String s = null;
		
		while(!me.isEmpty()){
			s = (String)me.pop();
			System.out.println(s);
			
		}

	}

}
