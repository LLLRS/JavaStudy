package com.day16;
/*
 * LinkedList
	����LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
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
