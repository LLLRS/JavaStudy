/**
 * 
 */
package waapper.demo;

import java.util.Arrays;

/**
 * @author Administrator
 * ��һ���ַ����е���ֵ���д�С���������
 */

public class WapperTest {
	public static void main(String[] args) {

		String str = "1 34 -6 8 45 23 56 9 28 0";
		stringArry(str);
	}
	
	public static void stringArry(String str) {
		
		String[] arr = stringToArrry(str);//�ع�
		
		int[] temp = new int[arr.length];
		
		System.out.println("δ����ģ�");
		
		//���ַ���ת��Ϊint��
		for(int i = 0;i<arr.length;i++) {
			temp[i] = Integer.parseInt(arr[i]);
			sop(temp[i]);
		}
		
		System.out.println();
		System.out.println("�����ģ�");
		
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
