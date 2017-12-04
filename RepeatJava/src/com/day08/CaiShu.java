package com.day08;
//猜数小游戏

import java.util.Scanner;

public class CaiShu {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100)+1;
		//System.out.println(num);
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个数(1-100)：");
		
		while(true){

			int t = in.nextInt();
			if(t>num){
				System.out.println("猜的数大了，请重新输入一个数(1-100)：");
			}
			else if(t<num){
				System.out.println("猜的数小了，请重新输入一个数(1-100)：");
			}
			else{
				System.out.println("猜对了！");
				break;
			}

		}
		in.close();
	}

}
