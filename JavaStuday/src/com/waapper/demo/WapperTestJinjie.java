package waapper.demo;

import java.util.Arrays;

/**
* @author Administrator �Ľ�
* ��һ���ַ����е���ֵ���д�С���������,������һ���µ��ַ���
*/
public class WapperTestJinjie {
	private static final String SPACE_SEPARATOR = " ";
	public static void main(String[] args) {

		String str = "1 34 -6 8 45 23 56 9 28 0";
		sop("δ����ģ�"+str);
		str = stringArry(str);
		sop("�����ģ�"+str);

	}
	
	public static String stringArry(String str) {
		
		//���ַ�������ַ�������
		String[] arr = stringToArrry(str);//�ع�
		
		//���ַ���ת��Ϊint��
		int[] temp = IntArray(arr);
		
		//��int��������
		Arrays.sort(temp);
			
		//��������int�������ַ���
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
