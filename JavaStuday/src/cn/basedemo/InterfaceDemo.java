package cn.basedemo;
/*interface ���ڶ���ӿ�
 * 1.��ӿ��г������壺���������󷽷�
 * 2.�̶����Σ� ��Ա����public��
 *  	
 *	������public static final
 * 	������public abstract
 * 
 * �ӿڿ��Ա����ʵ�֣��Զ�̳в�֪���ֵ�ת��
 * ����ӿ���ʵ�ֹ�ϵ�������ࡢ�ӿ���ӿ��Ǽ̳й�ϵ���ӿ�֮����Զ�̳�
 * 
 * �������ܶ��������У���չ���ܶ����ڽӿ���
 * */
interface Inter{
	public static final int NUM = 3;
	public abstract void show();
}

interface Inter1{
	public abstract void show1();
}


class Test implements Inter,Inter1 {	
	public void show() { }
	public void show1(){ }
}

public interface InterfaceDemo {

}
