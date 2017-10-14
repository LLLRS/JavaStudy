/**
 * 
 */
package waapper.demo;

import java.util.Arrays;

/**
 * @author Administrator
 * 对一个字符串中的数值进行从小到大的排序
 */

public class WapperTest {
	public static void main(String[] args) {

		String str = "1 34 -6 8 45 23 56 9 28 0";
		stringArry(str);
	}
	
	public static void stringArry(String str) {
		
		String[] arr = stringToArrry(str);//重构
		
		int[] temp = new int[arr.length];
		
		System.out.println("未排序的：");
		
		//将字符串转换为int型
		for(int i = 0;i<arr.length;i++) {
			temp[i] = Integer.parseInt(arr[i]);
			sop(temp[i]);
		}
		
		System.out.println();
		System.out.println("排序后的：");
		
	    Arrays.sort(temp);
	    
		for(int i = 0;i<arr.length;i++) 
			sop(temp[i]);

	}


	private static String[] stringToArrry(String str) {
		String[] arr = str.split(" ");
		 
		return arr;
	}



	public static void sop(Object obj) {
		
		System.out.print(obj+" ");
	}

}
