package collection.demo;

/*
 *��LinhkedListģ��һ����ջ���߶������ݽṹ
 *
 *��ջ�� �Ƚ��ȳ�  FILO
 *
 *���У��Ƚ��ȳ� FIFO
 * 
 * ��װһ������
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
