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
				System.out.println("������ȷ");
				break;
			}
			else{
				i--;
				System.out.println("������󣬻���������"+i+"��");
			}
			
		}
		sc.close();
	}

}
