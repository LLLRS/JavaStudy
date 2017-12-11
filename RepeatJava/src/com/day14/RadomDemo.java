package com.day14;

import java.util.Scanner;

//利用Math.radom方法产生一个任意范围内的随机数

public class RadomDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入开始范围：");
		int start = sc.nextInt();
		System.out.println("输入结束范围：");
		int end = sc.nextInt();
		
		//测试
		
		for(int i=0;i<100;i++){
			System.out.println((int)((end-start+1)*Math.random()+start));
		}

	}

}
