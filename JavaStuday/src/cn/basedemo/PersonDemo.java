package cn.basedemo;
/*
 * ���캯����Ϊ������г�ʼ��,����һ����������,ֻ����һ�� 
 * ������������ã�
 * 
 * 
 * 
 * */

class Person{
	private String name;
	private int age;
	//�������飬�����ѽ��������У������ڹ��캯��ִ��,�����ж������ͳһ��ʼ��������
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
