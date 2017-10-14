package Demo;
/*
 * 多态：事物存在的多种形态
 * 
 * instanceof 判断所属类型
 * 
 * eg:Animal c = new Cat(); c.eat(); == Cat c = new Cat(); c.eat();
 * 
 * 1.体现： 父类的引用指向了自己的子类对象
 * 2.前提：有继承或者实现关系
 * 3.好处：提高了程序的扩展性
 * 4.弊端：只能访问父类中的成员
 * 5.应用：
 * 
 * */
abstract class Animal{
	abstract void eat();
}


class Cat extends Animal{
	public void eat(){
		System.out.println("吃鱼");
		
	}
	public void catchm(){
		System.out.println("抓老鼠");
		
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("吃骨头");
		
	}
	public void kaimen(){
		System.out.println("看门");
		
	}
}

public class DuotaiDemo1 {
	public static void main(String[] args) {
		Animal c = new Cat(); //向上转型
		c.eat();
		//引用子类类型
		Cat a = (Cat)c;
		a.catchm();
		fu(new Dog());
	}
	
	public static void fu(Animal c) {
		c.eat();
		if(c instanceof Cat) {
			Cat a = (Cat)c;
			a.catchm();
		}
		else if(c instanceof Dog) {
			Dog a = (Dog)c;
			a.kaimen();
			
		}  			
	}
}
