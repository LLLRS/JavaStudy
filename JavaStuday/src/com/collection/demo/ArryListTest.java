package collection.demo;

/*
 * ȥ��arrylist�е��ظ�Ԫ��
 * ˼·��
 *   �½�һ����������Դ�����е�Ԫ�ذ������룬�ظ��򲻷���
 * ע�⣺contains��remove�����У�������eqals������
 * */

import java.util.ArrayList;
import java.util.ListIterator;

public class ArryListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
 	    singleDemo();
		PersonDemo();
		

	}





	private static void PersonDemo() {
		ArrayList<Person> arr = new ArrayList<Person>();
		
		
		arr.add(new Person("zhangsan1",21));
		arr.add(new Person("zhangsan1",21));
		arr.add(new Person("zhangsan2",22));
		arr.add(new Person("zhangsan3",23));
		
		System.out.println("ȥ��ǰ�� "+arr);
//		sop(arr);
		arr = removeSingleElement(arr);
		System.out.println("ȥ���� "+arr);
//		sop(arr);
	}


	private static void singleDemo() {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("abc1");
		arr.add("abc3");
		arr.add("abc2");
		arr.add("abc1");
		arr.add("abc3");
		arr.add("abc2");
		arr.add("abc2");
		arr.add("abc2");

		System.out.println("ȥ��ǰ�� "+arr);
		arr = removeSingleElement(arr);
		System.out.println("ȥ���� "+arr);
	}
	

	public static <E> ArrayList<E> removeSingleElement(ArrayList<E> a) {
		
		ArrayList<E> temp = new ArrayList<E>();
		
		
		ListIterator<E> it = a.listIterator();
		/*
		while(it.hasNext()){
			
			if(!temp.contains(it.next()))
				temp.add(it.previous());
				
		}
		*/
		while(it.hasNext()){
//			Person obj = it.next();
			if(!temp.contains(it.next()))
				temp.add(it.previous());
				
		}
		return temp;
	}
	
public static ArrayList<String> removeSingleElement2(ArrayList<String> a) {
		
		ArrayList<String> temp = new ArrayList<String>();
		
		
		ListIterator<String> it = a.listIterator();
		/*
		while(it.hasNext()){
			
			if(!temp.contains(it.next()))
				temp.add(it.previous());
				
		}
		*/
		while(it.hasNext()){
			String obj = it.next();
			if(!temp.contains(obj))
				temp.add(obj);
				
		}
		return temp;
	}
	
	public static void sop( ArrayList<Person> a) {
		ListIterator<Person> it = a.listIterator();
		
		while(it.hasNext()){	
			Person p =  it.next();
			p.show();
		}
	}
}
