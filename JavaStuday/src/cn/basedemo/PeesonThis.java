package cn.basedemo;

/*
 * this用于区分局部变量和成员变量同名的情况
 * this那个函数在调用this所在的对象，this就代表谁
 * 应用：1.当本类中功能用到了本类对象，都用this代替
 *     2.构造函数之间互相调用,只能放在第一行
 */
class Person1{
	private String name;
	private int age;
	
	{
		System.out.println("Person Code run");	 
	}
    
	Person1(String name){
		this.name = name;
		
	}
	
	Person1(String name,int age){
		this(name);//相当于Person1(lisi)
		this.age = age;	
	}
	
	public void speak() {
		System.out.println("name="+name+",,age="+age);
		
	}
	
	public boolean compare(Person1 p) {
		return this.age==p.age;
	}
	
}
/*需求：比较是不是同龄人
 * 
 * 
 * */
public class PeesonThis {
	public static void main(String[] args) {
		
		Person1 p1 = new Person1("lisi",20);
		Person1 p2 = new Person1("zhang",20);
		boolean b = p1.compare(p2);
		System.out.println(b);
		
	}

}
