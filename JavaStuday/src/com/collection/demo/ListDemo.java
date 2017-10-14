package collection.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	 
		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			
			//show(list);
						
			show2(list);
		}

		public static void show2(List<String> list) {

			
			
			list.add("abc1");
			list.add("abc2");
			list.add("abc3");
			
			System.out.println("list:"+list);
			ListIterator<String> it = list.listIterator();//��ȡ�б����������
			//������ʵ���ڵ�����������ɶ�Ԫ�ص���ɾ�Ĳ顣
			//ע�⣺ֻ��list���Ͼ߱��õ�������.
			
			//hasPrevious ��������
			while(it.hasPrevious()){
				
				Object obj = it.previous();
				
				if(obj.equals("abc2")){
					it.add("abc9");
					it.set("abc9");
				}
			}
			System.out.println("hasNext:"+it.hasNext());
			System.out.println("hasPrevious:"+it.hasPrevious());
			
			
			
			/*Iterator it = list.iterator();
			while(it.hasNext()){
				
				Object obj = it.next();//java.util.ConcurrentModificationException
								//�ڵ����������У���Ҫʹ�ü��ϲ���Ԫ�أ����׳����쳣��
							//����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator������ڵ����ж�Ԫ�ؽ��и���Ĳ����� 
				
				if(obj.equals("abc2")){
					list.add("abc9");
				}
				else
					System.out.println("next:"+obj);
			}
			System.out.println(list);
			*/
			
		}

		public static void show(List<String> list) {
			
			//���Ԫ��
			list.add("abc1");
			list.add("abc2");
			list.add("abc3");
			
			System.out.println(list);
			
			//����Ԫ�ء�
			 list.add(1,"abc9");
			System.out.println("insert:"+ list);
			
			//ɾ��Ԫ�ء�
			System.out.println("remove:"+list.remove(2));
			System.out.println(list);
			
			//�޸�Ԫ�ء�
 		    System.out.println("set:"+list.set(1, "abc8"));
 		    System.out.println(list);
 		    
			//��ȡԪ�ء�
 		    System.out.println("get:"+list.get(0));
 		
 		    
 		    //��ȡ���б�
 		    System.out.println("sublist:"+list.subList(1, 2));
			
				
			
		}

}