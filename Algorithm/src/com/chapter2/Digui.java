package com.chapter2;

import java.util.Arrays;

//判断一个数组是否有序

public class Digui {
	public static void main(String[] args){
		int arr[] = {1,8,3,4,7,5}; //无序

//		Arrays.sort(arr); //有序
		
		for(int t:arr){
			System.out.print(t+" ");
		}
		System.out.println();
		System.out.println(isArray(arr,arr.length));
	}
    
//	public static int isArray(int[] a,int index){
//		if(a.length==1) return 1;
//		return (a[index-1]>=a[index-2]?isArray(a,index-1):0);
//		
//	}
	public static int isArray(int[] a,int index){
		if(index==1) return 1;
		return (a[index-1]<=a[index-2]?0:isArray(a,index-1));
		
	}
}
