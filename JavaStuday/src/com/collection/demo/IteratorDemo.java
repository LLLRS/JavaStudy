package collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		Collection<String> coll = new ArrayList<String>();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		
		//使用了Collection中的iterator()方法
		//调用集合中的迭代器方法，是为了获取集合中的迭代器对象
		Iterator<String> it = coll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		//for 循环结束后，迭代器消失
		//while迭代结束后，next()已经指向最后一个位置，但it对象还在
		//实际开发一般用for
		
		//for(Iterator it = coll.iterator(); it.hasNext(); ){
		//	System.out.println(it.next());
		//}
	}

}
