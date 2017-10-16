package cn.basedemo;
/*interface 用于定义接口
 * 1.借接口中常见定义：常量，抽象方法
 * 2.固定修饰： 成员都是public的
 *  	
 *	常量：public static final
 * 	方法：public abstract
 * 
 * 接口可以被类多实现，对多继承不知所持的转换
 * 类与接口是实现关系，类与类、接口与接口是继承关系，接口之间可以多继承
 * 
 * 基本功能定义在类中，扩展功能定义在接口中
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
