package cn.basedemo;
/*
 * 构造函数：为对象进行初始化,对象一建立就运行,只运行一次 
 * 方法被对象调用；
 * 
 * 
 * 
 * */

class Person{
	private String name;
	private int age;
	//构造代码块，对象已建立就运行，优先于构造函数执行,给所有对象进行统一初始化，共性
	{
		System.out.println("Person Code run");
		 
	}
	
	Person(){
		System.out.println("A: name="+name+",,age="+age);
	}
	
	Person(String name){
		name = name;
		System.out.println("B: name="+name+",,age="+age);
	}
	
	Person(String n,int a){
		name = n;
		age = a;
		System.out.println("C: name="+name+",,age="+age);
	}
	
	public void cry() {
		System.out.println("cry.........");
		
	}
	
}


public class PersonDemo {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.cry();
		Person p2 = new Person("zhang");
		Person p3 = new Person("zhang",1);
	}
	

}
