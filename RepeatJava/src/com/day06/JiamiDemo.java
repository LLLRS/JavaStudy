package com.day06;
//加密问题演示

public class JiamiDemo {

	public static void main(String[] args) {
		int num = 654321;
		int arr[] =new int[6];
		int div = 100000;
		for(int i = 0;i<6;i++){
			
			arr[i] = num/div;
			//加密
			arr[i] = fun(arr[i]);
			num=num%div;
			div=div/10;
//			System.out.println(arr[i]);
		}
		
		swap(arr[0],arr[5]);
		
		for(int t:arr){
			System.out.print(t);
		}
			
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = i;
		i = j;
		j = temp;  	
	}

	private static int fun(int i) {
		// TODO Auto-generated method stub	
		return ((i+5)%10);
	}

}
