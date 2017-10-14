package tool.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		/*
		 * Collections���Ǽ��Ͽ�ܵĹ����ࡣ
		 * ����ķ������Ǿ�̬�ġ�
		 */
		demo_2();

	}

	public static void demo_2(){
		List<String> list = new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
//		Collections.sort(list);
		System.out.println(list);
		
//		int index = Collections.binarySearch(list, "cba");		
//		System.out.println("index="+index);
		
		//��ȡ���ֵ��
		String max = Collections.max(list,new ComparatorByLength());
		System.out.println("max="+max);
	}
	
	
	
	public static void demo_1(){
		
		List<String> list = new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
		System.out.println(list);
		
		
		//��list���Ͻ���ָ��˳�������
		Collections.sort(list);
		
//		mySort(list);
//		mySort(list,new ComparatorByLength());
//		Collections.sort(list,new ComparatorByLength());
		System.out.println(list);
	}
	
	//Demo 
	public static <T> void mySort(List<T> list,Comparator<? super T> comp){
		
		for (int i = 0; i < list.size()-1; i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				
				if(comp.compare(list.get(i), list.get(j))>0){
					
					Collections.swap(list, i, j);
					
				}
			}
		}
	}
	
	
	public static <T extends Comparable<? super T>> void mySort(List<T> list){
		
		for (int i = 0; i < list.size()-1; i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				
				if(list.get(i).compareTo(list.get(j))>0){
					
//					T temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
					Collections.swap(list, i, j);
					
				}
			}
		}
	}
}
