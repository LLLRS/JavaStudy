package cn.basedemo;

/*
 * this�������־ֲ������ͳ�Ա����ͬ�������
 * this�Ǹ������ڵ���this���ڵĶ���this�ʹ���˭
 * Ӧ�ã�1.�������й����õ��˱�����󣬶���this����
 *     2.���캯��֮�以�����,ֻ�ܷ��ڵ�һ��
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
		this(name);//�൱��Person1(lisi)
		this.age = age;	
	}
	
	public void speak() {
		System.out.println("name="+name+",,age="+age);
		
	}
	
	public boolean compare(Person1 p) {
		return this.age==p.age;
	}
	
}
/*���󣺱Ƚ��ǲ���ͬ����
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
