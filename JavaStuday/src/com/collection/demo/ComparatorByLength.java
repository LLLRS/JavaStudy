package collection.demo;

import java.util.Comparator;

/**
 * 创建了一个以字符串长度进行排序的比较器。
 */
public class ComparatorByLength implements Comparator<String> {

	@Override
	public int compare(String s1, String s2){
			
		int temp = s1.length()-s2.length();
		
		return temp==0?s1.compareTo(s2): temp;
	}

}
