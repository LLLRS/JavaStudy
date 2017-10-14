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
			ListIterator<String> it = list.listIterator();//获取列表迭代器对象
			//它可以实现在迭代过程中完成对元素的增删改查。
			//注意：只有list集合具备该迭代功能.
			
			//hasPrevious 反向索引
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
								//在迭代器过程中，不要使用集合操作元素，容易出现异常。
							//可以使用Iterator接口的子接口ListIterator来完成在迭代中对元素进行更多的操作。 
				
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
			
			//添加元素
			list.add("abc1");
			list.add("abc2");
			list.add("abc3");
			
			System.out.println(list);
			
			//插入元素。
			 list.add(1,"abc9");
			System.out.println("insert:"+ list);
			
			//删除元素。
			System.out.println("remove:"+list.remove(2));
			System.out.println(list);
			
			//修改元素。
 		    System.out.println("set:"+list.set(1, "abc8"));
 		    System.out.println(list);
 		    
			//获取元素。
 		    System.out.println("get:"+list.get(0));
 		
 		    
 		    //获取子列表。
 		    System.out.println("sublist:"+list.subList(1, 2));
			
				
			
		}

}