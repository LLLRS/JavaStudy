package tool.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		/*
		 * Collections：是集合框架的工具类。
		 * 里面的方法都是静态的。
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
		
		//获取最大值。
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
		
		
		//对list集合进行指定顺序的排序。
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
