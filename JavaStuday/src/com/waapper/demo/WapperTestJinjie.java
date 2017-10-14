package waapper.demo;

import java.util.Arrays;

/**
* @author Administrator 改进
* 对一个字符串中的数值进行从小到大的排序,并返回一个新的字符串
*/
public class WapperTestJinjie {
	private static final String SPACE_SEPARATOR = " ";
	public static void main(String[] args) {

		String str = "1 34 -6 8 45 23 56 9 28 0";
		sop("未排序的："+str);
		str = stringArry(str);
		sop("排序后的："+str);

	}
	
	public static String stringArry(String str) {
		
		//将字符串变成字符串数组
		String[] arr = stringToArrry(str);//重构
		
		//将字符串转换为int型
		int[] temp = IntArray(arr);
		
		//对int数组排序
		Arrays.sort(temp);
			
		//将排序后的int数组变成字符串
		str = ArrryTostring(temp);

		return str;

	}

	private static int[] IntArray(String[] arr) {
		
		int[] temp = new int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			temp[i] = Integer.parseInt(arr[i]);

		}
		return temp;
	}


	private static String[] stringToArrry(String str) {
		String[] arr = str.split(SPACE_SEPARATOR);
		 
		return arr;
	}

	private static String ArrryTostring(int[] temp) {
		
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<temp.length; x++){
			if(x!=temp.length-1)
				sb.append(temp[x]+SPACE_SEPARATOR);
			else
				sb.append(temp[x]);
		}
		
		return sb.toString();
	}

	public static void sop(Object obj) {
		
		System.out.println(obj);
	}


}
