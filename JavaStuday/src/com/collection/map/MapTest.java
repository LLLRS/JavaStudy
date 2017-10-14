package collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



/*
 * 练习:
 * "fdgavcbsacdfs" 获取该字符串中，每一个字母出现的次数。
 * 要求打印结果是：a(2)b(1)...;
 * 思路：
 * 对于结果的分析发现，字母和次数之间存在着映射的关系。而且这种关系很多。
 * 很多就需要存储，能存储映射关系的容器有数组和Map集合。
 * 关系一方式有序编号吗？没有！(有的话可以用数组 )
 * 那就使用Map集合。 又发现可以保证唯一性的一方具备着顺序如 a b c ...
 * 所以可以使用TreeMap集合。
 * 
 * 这个集合最终应该存储的是字母和次数的对应关系。 
 * 
 * ***思路很重要***
 * 1，因为操作的是字符串中的字母，所以先将字符串变成字符数组。
 * 2，遍历字符数组，用每一个字母作为键去查Map集合这个表。
 * 如果该字母键不存在，就将该字母作为键 1作为值存储到map集合中。
 * 如果该字母键存在，就将该字母键对应值取出并+1，在将该字母和+1后的值存储到map集合中，
 * 键相同值会覆盖。这样就记录住了该字母的次数.
 * 3，遍历结束，map集合就记录所有字母的出现的次数.
 * 
 * 
 */


public class MapTest {

	public static void main(String[] args) {
		
		String str = "fdAga 1vS Dcb3s ac4dfs";
		//将字符串转换为char型数组
		//char[] chs = charArray(str);
		char[] chs = str.toCharArray(); // 更简单
		
		//遍历字符数组,打印结果
		String s = getMap(chs);
		
		System.out.println(s);
		
		
	}

	public static String getMap(char[] chs) {
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		for(int i=0;i<chs.length;i++) {
			if(!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z'))
//			if(!(Character.toLowerCase(chs[i])>='a' && Character.toLowerCase(chs[i])<='z'))
				continue;
			Integer value = tm.get(chs[i]);
			int count = 1;
			
			if(value != null)
				count = value + 1;
			
			tm.put(chs[i], count);
	
		}
		return mapPrint(tm);
	}
	
private static String mapPrint(TreeMap<Character, Integer> tm) {
	//不仅要把结果打印出来，而且要存成一个特定字符串
	StringBuilder sb = new StringBuilder();
	
	Set<Map.Entry<Character, Integer>>entrySet  = tm.entrySet();

	Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
	
	while(it.hasNext()){
		Map.Entry<Character, Integer> me = it.next();
		Character p = me.getKey();
		Integer va = me.getValue();
		sb.append(p+"("+va+")");
		//System.out.print(p+"("+va+")");
	
		}
	return sb.toString();
		
	}

//	private static void mapPrint(TreeMap<Character, Integer> tm) {
//
//		Iterator<Character> it = tm.keySet().iterator();
//		
//		while(it.hasNext()){
//			
//			Character key =  it.next();;
//			Integer va= tm.get(key);
//			System.out.println(key+"("+va+")");
//		}	
//	}
	
//	private static char[] charArray(String str) {
//		
//		char[] temp = new char[str.length()];
//		
//		str.getChars(0, str.length(), temp,0);
//		return temp;
//	}
	
	
}
