package com.day09;
/**
 *�̳У�
 *	�������еķ����������У���д
 *	�������еķ���������û�У��̳� 
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
