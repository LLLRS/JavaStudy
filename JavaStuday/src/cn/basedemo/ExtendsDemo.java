package cn.basedemo;
/*
 * �̳� ����������֮�������ϵ
 *      ֻ�е�������֮����������ϵ��is a���ſ��Լ̳�
 *      ֻ֧�ֵ��̳�
 *      ���Զ��̳�
 *      
 *      super ������������
 *    1.����
 *    ��������г����˽�еĵ�ͬ����Ա���� ʱ��
 *    ������ʱ����еı�����this�����ʸ����еı�����super
 *    2.�Ӹ����еĺ��� 
 *    ����ͬ�����������า�ǣ���д������
 *    ����:Ҫ������Ȩ�޴��ڵ��ڸ���Ȩ��
 *    3.�Ӹ����еĹ��캯��
 *    �ڶ��������Ĺ��캯�����ѳ�ʼ��ʱ�����๹�캯��Ҳ��ִ���ҽ�ִ��super();--����ʽ
 *    this��superֻ�ܴ���һ��  
 *    ��������û�пղ����Ĺ��캯��ʱ����������ֶ�ͨ��super������ƶ����ʸ����еĹ��캯��
	     ֻ�ܷ��ڵ�һ��
	     
 * */

class Pers{  //����
	String name;
	int age;
}

class Student extends Pers{ //����
	
	void study(){
		
		System.out.println("good good study");
	}
	
} 

class Worker extends Pers{
	
	void work(){
		
		System.out.println("good good work");
	}
	
} 
public class ExtendsDemo {

}
