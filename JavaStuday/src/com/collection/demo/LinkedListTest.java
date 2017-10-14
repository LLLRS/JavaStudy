package collection.demo;

/*
 *用LinhkedList模拟一个堆栈或者队列数据结构
 *
 *堆栈： 先进先出  FILO
 *
 *队列：先进先出 FIFO
 * 
 * 封装一个新类
 * */

public class LinkedListTest {
	public static void main(String[] args) {
		
		DuiLie link = new DuiLie();
		
		link.myAdd("abs1");
		link.myAdd("abs2");
		link.myAdd("abs3");
		
		while(!link.mySize()) {
			System.out.println(link.myGet());
		}
		
		
	}
	
}
