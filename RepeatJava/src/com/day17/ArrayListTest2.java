package com.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
	����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
*/
public class ArrayListTest2 {

	public static void main(String[] args) {
		System.out.println("������Ԫ�أ�");
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<>();
		
		int temp = 0;
		while(true){
			temp=sc.nextInt();
			if(temp == 0)  break;
			
			a.add(temp);
		}
		Integer[] arr = new Integer[a.size()];
		a.toArray(arr);
		
		Arrays.sort(arr);
		
		System.out.println(arr[a.size()-1]);
		
		sc.close();
	}

}
