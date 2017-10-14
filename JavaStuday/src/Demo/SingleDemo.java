package Demo;
/*
 * 设计模式：解决膜一类问题最有效的方法
 * 
 * 单例设计模式：一个 类在内存中只存在一个对象
 * 
 * 保证唯一性：
 * 1.精致其他程序建立该类对象
 * 2.在本类中自定义一个对象
 * 3.提供一个方法可以获取到该对象
 * 
 * 代码：
 * 1.构造函数私有化
 * 2.在类中创建一个本类对象
 * 3.提供一个方法
 * 
 * */

class Single{
	//饿汉式
	private Single() {}
	private static Single s = new Single();
	public static Single getInstance() {
		return s;
	}
	/*懒汉式
	 * private static Single s = null;	
	 * private Single() {}
		public static Single getInstance() {
		if(s==null){
			synchronized(Single.class){ 
				if(s==null)
					s =  new Single(); 
				}
		}
		return s;
	}
	 * 
	 * */
	//描述不会变 
}

public class SingleDemo {
	public static void main(String[] args) {
		
		Single ss = Single.getInstance();
		
		System.out.println("bbbb");
		
	}

}
