package com.day13;

public class ArrayPaixu {

	public static void main(String[] args) {
		//int����
		int[] arr = {5,8,7,4,2};
		
//		arr = Maopao(arr);		
		arr = Xuanze(arr);
		for(int t:arr){
			System.out.print(t+"  ");
		}
		System.out.println();
//		//�ַ������� -->��dacgebf�� �������abcdefg��
//		String s = "dacgebf";
//		
//		s = maopaoForString(s);
//		System.out.println(s);
		
//		int t = Zheban(arr,9);
//		System.out.println(t);
	
	}
    //�۰����
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

	//ð������
//	����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������

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
	
	//ѡ������
//	��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������

	public static int[]  Xuanze(int[] arr){
		int temp;

		for(int i=0;i<arr.length-1;i++){
//			-->��֤ÿ��������С����ǰ��
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
