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
		
		//ʹ����Collection�е�iterator()����
		//���ü����еĵ�������������Ϊ�˻�ȡ�����еĵ���������
		Iterator<String> it = coll.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		//for ѭ�������󣬵�������ʧ
		//while����������next()�Ѿ�ָ�����һ��λ�ã���it������
		//ʵ�ʿ���һ����for
		
		//for(Iterator it = coll.iterator(); it.hasNext(); ){
		//	System.out.println(it.next());
		//}
	}

}
