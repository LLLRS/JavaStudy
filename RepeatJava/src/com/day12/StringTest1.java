package com.day12;
/*
 * �������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
	������int[] arr = {1,2,3};	
	��������[1, 2, 3] 

 * 
 * 
 * */
public class StringTest1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		String s = "[";
		for(int i = 0;i<arr.length;i++){
			if(i==arr.length-1){
				s +=(arr[i]+"]");
			}else{
				s +=(arr[i]+",");
			}
			
		}
		System.out.println(s);
	}

}
