package cn.ad;

import java.util.TreeSet;
import java.util.Vector;

/*====第九题==================================
编写一个方法。去除Vector集合中的重复元素。
*/

public class removeVector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		v.add("abc");
		v.add("abc1");
		v.add("abc2");
		v.add("abc1");
		v.add("abc3");
		v.add("abc2");
		//去除前
		System.out.print("去除前: ");
		for(String s:v)
			System.out.print(s+"  ");
		//去除Vretor中多余元素
		v = removeAdd(v);
		System.out.println();
//		去除后
		System.out.print("去除后: ");
		for(String s:v)
			System.out.print(s+"  ");
	}

	public static Vector<String> removeAdd(Vector<String> v) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		for(String s:v)
			ts.add(s);
		
		v.clear();
		
		for(String s:ts)
			v.add(s);
		
		return v;
	}

}
