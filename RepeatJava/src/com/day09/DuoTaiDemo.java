package com.day09;
/**
 *继承：
 *	父类中有的方法，子类有：重写
 *	父类中有的方发，子类没有：继承 
 * 
 */
class A{
	public void show(){
		show2();
	}
	public void show2(){
		System.out.println("A");
	}
}

class  B extends A{
	
	public void show2(){
		System.out.println("B");
	}
}

class  C extends B{
	public void show(){
		super.show();
	}
	public void show2(){
		System.out.println("C");
	}
}
public class DuoTaiDemo {

	public static void main(String[] args) {
		A a = new B();
		a.show();
		
		B b = new C();
		b.show();

	}

}
