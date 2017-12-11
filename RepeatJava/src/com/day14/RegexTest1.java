package com.day14;

public class RegexTest1 {
/* 
 * 有如下一个字符串:”91 27 46 38 50”
       请写代码实现最终输出结果是：”27 38 46 50 91”
*/
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		
		String[] t = s.split(" ");
		
		int[] arr =new int[t.length];
		for(int i=0;i<t.length;i++){		
			arr[i] = Integer.parseInt(t[i]);
		}
		
		s = maopaoForString(arr);
		
		System.out.println(s);
	}
	
	public static String maopaoForString(int[] arr) {
		int temp;
		
		for(int i=1;i<arr.length;i++){
			for(int k=1;k<=arr.length-i;k++){
				if(arr[k-1]>arr[k]){
					temp = arr[k];
					arr[k] = arr[k-1];
					arr[k-1] = temp;
				}
			}				
		}	
		String s = "";
		
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				s += arr[i];
				break;
			}
			s +=(arr[i]+"  ");
		}
		return s;
	}
}
