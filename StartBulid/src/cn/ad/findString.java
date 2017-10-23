package cn.ad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*====第六题==================================
取出一个字符串中字母出现的次数。如："abcdekka27qoq"  a(2)b(1)k(2)...

计算字符串中子串出现的位置，
例：子串"kk"在字符串abkkcdkkabkkefkk中出现的次数
*/
public class findString {

	public static void main(String[] args) {
		
//		demo1();
//		findStringDemo1();
//		利用正则
//		findStringDemo2();
		demo2();

	}
	
	/*====第十三题==================================
	找出一个整数数组{2,4,1,4,3,2,4,3,2}出现次数最多的数。
	*/
	private static void demo2() {
	  int[] buf =  {2,1,4,3,2,4,3,2};
	  TreeMap<Integer,Integer> ts = new TreeMap<>();
	
	
		for(int i =0;i<buf.length;i++) {
				
				if(ts.get(buf[i])==null)
					ts.put(buf[i], 1);
				else {
					int value = ts.get(buf[i]);
					value++;
					ts.put(buf[i], value);
				}

			}
	
		Set<Integer> s = ts.keySet();

		ArrayList<Integer> sb = new ArrayList<>();
		
		Iterator<Integer> me = s.iterator();
		while(me.hasNext()) {	
			sb.add(me.next());
		}
		
		int [] key =   new int[ts.size()];
		int[] value =  new int[ts.size()];
		for(int i =0;i< ts.size();i++){
			key[i] = sb.get(i);
			value[i] = ts.get(key[i]);
		}
		System.out.println("数组中出现次数最多的是："+key[getMaxIndex(value)]);
		
	}
    public static int getMaxIndex(int[] arr){
       int max = 0;
       for(int i=1;i<arr.length;i++) {
    	   if(arr[max]<arr[i])
    		   max = i;
    	   
       }
       return max;
  }
	public static void findStringDemo2() {
		String str = "abkkcdkkabkkkefkkkkgggg";
		String pattern = "kk";
		Pattern p = Pattern.compile(pattern);
		
		int count = 0;
		
		Matcher m = p.matcher(str);
		while(m.find()) {
			
			count++;
		}
		System.out.println(count);
		
	}

	public static void demo1() {
		TreeMap<Character,Integer> ts = new TreeMap<Character,Integer>();
		String str = "abcdekka27qoq" ;
		
		char[] temp = str.toCharArray();
		for(int i =0;i<str.length();i++) {
			if(temp[i]>='a'&&temp[i]<='z') {
				
				if(ts.get(temp[i])==null)
					ts.put(temp[i], 1);
				else {
					int value = ts.get(temp[i]);
					value++;
					ts.put(temp[i], value);
				}

			}
			
		}
		Set<Character> s = ts.keySet();
		Iterator<Character> me = s.iterator();
		while(me.hasNext()) {
			char key = me.next();
			int value = ts.get(key);
			System.out.print(key+"("+value+")");
			
		}
	}

	public static void findStringDemo1() {
		
		String str = "abkkcdkkabkkkefkkkkgggg";
		
		StringBuilder sb = new StringBuilder(str);
		
		int count = 0;
		int index = 0;
		int num =0;
		while(index<sb.length()) {
			
			index = sb.indexOf("kk",num);
			if(index<0) break;
			num = index + 1;
//			System.out.println(index);
			count++;
		}
			
		System.out.println(count);
	}

}
