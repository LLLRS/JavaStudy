package Demo;
/*
 * ��̬��������ڵĶ�����̬
 * 
 * instanceof �ж���������
 * 
 * eg:Animal c = new Cat(); c.eat(); == Cat c = new Cat(); c.eat();
 * 
 * 1.���֣� ���������ָ�����Լ����������
 * 2.ǰ�᣺�м̳л���ʵ�ֹ�ϵ
 * 3.�ô�������˳������չ��
 * 4.�׶ˣ�ֻ�ܷ��ʸ����еĳ�Ա
 * 5.Ӧ�ã�
 * 
 * */
abstract class Animal{
	abstract void eat();
}


class Cat extends Animal{
	public void eat(){
		System.out.println("����");
		
	}
	public void catchm(){
		System.out.println("ץ����");
		
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("�Թ�ͷ");
		
	}
	public void kaimen(){
		System.out.println("����");
		
	}
}

public class DuotaiDemo1 {
	public static void main(String[] args) {
		Animal c = new Cat(); //����ת��
		c.eat();
		//������������
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
