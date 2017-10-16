package cn.basedemo;
/*
 * 继承 ：让类与类之间产生关系
 *      只有当类与类之间有所属关系（is a）才可以继承
 *      只支持单继承
 *      可以多层继承
 *      
 *      super 父类对象的引用
 *    1.变量
 *    如果子类中出象非私有的的同名成员变量 时，
 *    子类访问本类中的变量用this，访问父类中的变量用super
 *    2.子父类中的函数 
 *    出现同名函数，子类覆盖（重写）父类
 *    覆盖:要求子类权限大于等于父类权限
 *    3.子父类中的构造函数
 *    在对子类对象的构造函数惊醒初始化时，父类构造函数也会执行且仅执行super();--》隐式
 *    this与super只能存在一个  
 *    当父类中没有空参数的构造函数时，子类必须手动通过super语句来制定访问父类中的构造函数
	     只能放在第一行
	     
 * */

class Pers{  //父类
	String name;
	int age;
}

class Student extends Pers{ //子类
	
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
