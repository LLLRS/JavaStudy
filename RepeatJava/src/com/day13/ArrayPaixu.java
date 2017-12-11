package com.day13;

public class ArrayPaixu {

	public static void main(String[] args) {
		//int数组
		int[] arr = {5,8,7,4,2};
		
//		arr = Maopao(arr);		
		arr = Xuanze(arr);
		for(int t:arr){
			System.out.print(t+"  ");
		}
		System.out.println();
//		//字符串排序 -->”dacgebf” 结果：”abcdefg”
//		String s = "dacgebf";
//		
//		s = maopaoForString(s);
//		System.out.println(s);
		
//		int t = Zheban(arr,9);
//		System.out.println(t);
	
	}
    //折半查找
	public static int Zheban(int[] arr,int t){
		int min = 0,max= arr.length-1;
		int mid = (min+max)/2;
//		for(int i =0;i<arr.length;i++){
//			if(t>arr[mid]){
//				min = mid+1;
//				mid= (min+max)/2;
//			}
//			else if(t>arr[mid]){
//				max = mid-1;
//				mid= (min+max)/2;
//			}else{
//				return mid;
//			}
//		}	
		while(t!=arr[mid]){
			if(t>arr[mid]){
				min = mid+1;			
			}
			else{
				max = mid-1;
			}
			
			if(min>max) return -1;
			mid= (min+max)/2;
		}
		return mid;
	}
	
	
	
	
	//
	public static String maopaoForString(String s) {
		char temp;
		char[] arr = s.toCharArray();
		
		for(int i=1;i<arr.length;i++){
			for(int k=1;k<=arr.length-i;k++){
				if(arr[k-1]>arr[k]){
					temp = arr[k];
					arr[k] = arr[k-1];
					arr[k-1] = temp;
				}
			}				
		}				
		return String.valueOf(arr);
	}

	//冒泡排序
//	相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处

	public static int[]  Maopao(int[] arr){
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
		return arr;
	}
	
	//选择排序
//	从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处

	public static int[]  Xuanze(int[] arr){
		int temp;

		for(int i=0;i<arr.length-1;i++){
//			-->保证每次排序最小的在前面
			for(int k=i;k<arr.length-1;k++){
				if(arr[i]>arr[k+1]){
					temp = arr[k+1];
					arr[k+1] = arr[i];
					arr[i] = temp;
				}
			}				
		}				
		return arr;
	}
}
