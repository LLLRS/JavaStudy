package stringbuffer.demo;

/**
 * @author Administrator
 *
 */
 
		/*
		 * jdk1.5以后出现了功能和StringBuffer一模一样的对象。就是StringBuilder
		 * 
		 * 不同的是：
		 * StringBuffer是线程同步的。通常用于多线程。
		 * StringBuilder是线程不同步的。通常用于单线程。 它的出现提高效率。
		 * 
		 * jdk升级：
		 * 1，简化书写。
		 * 2，提高效率。
		 * 3，增加安全性。
		 */
public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * StringBuffer:字符串的缓冲区
		 * 用于存储数据的容器
		 * 特点：
		 * 	1.长度可变,用构造函数初始化指定长度
		 * 	2.可以存储不同类型数据
		 * 	3.最终会转换成字符串使用
		 * 	4.可以修改字符串
		 *  功能：
		 *   1.添加：append
		 *   2.删除
				public StringBuffer deleteCharAt(int index)
				public StringBuffer delete(int start, int end)包含头，不包含尾
			 3.查找
				char charAt(int index)
				int indexOf(String str)返
				int indexOf(String str,int fromIndex)
		 *	 4.修改
		 *		 StringBuffer replace(int start, int end,String str)
 		 *		 void setCharAt( )
     			
		 * */
           bufferMethodDemo();
	}
	public static void bufferMethodDemo() {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append(true).append("hahah");
		//sb.append(true);
		sb.insert(1, "xixib");
		
		System.out.println(sb);
		
		
	}
}
