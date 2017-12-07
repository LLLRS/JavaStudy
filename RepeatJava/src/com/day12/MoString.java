package com.day12;

import java.util.Scanner;

public class MoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = "qaz";
		int i = 3;
		String temp = null;
		while(i>0){
			temp = sc.nextLine();
			if(s.equals(temp)){
				System.out.println("输入正确");
				break;
			}
			else{
				i--;
				System.out.println("输入错误，还可以输入"+i+"次");
			}
			
		}
		sc.close();
	}

}
