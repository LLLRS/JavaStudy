package com.chapter2;

import java.util.Arrays;

//�ж�һ�������Ƿ�����

public class Digui {
	public static void main(String[] args){
		int arr[] = {1,8,3,4,7,5}; //����

//		Arrays.sort(arr); //����
		
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
