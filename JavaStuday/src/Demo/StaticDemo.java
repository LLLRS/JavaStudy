package Demo;

/*static 静态  共享区
 * 用法：可以修饰成员变量（函数），可以直接被类名调用，类名.静态成员
 * 特点：
 * 1.随类的加载而加载
 * 2.优先于对象而存在
 * 3.被所有对象所共享
 * 4.可以直接被类名所调用
 * 
 * 注意：
 * 1、静态方法只能访问静态成员
 * 2.静态方法中不可以定义this关键字
 * 3.主函数是静态的
 * 
 * 
 * 如何定义：
 * 静态变量：对象中 出现共享数据
 * 
 * 静态函数：功能内部没有访问到非静态数据，工具类函数
 * 
 * 
 * 静态代码块：随着类的加载而执行，只执行一次，给类初始化，优先执行
 * static{
 * 
 * }
 * 
 * 静态代码块 》代码块》构造函数               
 * 
 * 初始化过程：
 * 1.
 * 2.
 * 3.在堆内存中开辟空间，分配内存地址
 * 4.在堆内存中建立对象的特有属性，并进行默认初始化
 * 5.显示初始化
 * 6.构造代码块初始化，
 * 7。构造函数初始化
 * */

class Persn{
	String name;//成员变量
	static String country = "cn";//类变量
	public void show() {
		System.out.println(name+":::"+country);
		
	}
	
}
public class StaticDemo {
	public static void main(String[] args) {
	Persn p = new Persn();	
	System.out.println(Persn.country);
	

	}

}
