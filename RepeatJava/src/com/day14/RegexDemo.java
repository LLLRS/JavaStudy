package com.day14;

import java.util.Scanner;

//У��һ���������

public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����һ���������:");
		
		String regex = "[1-9A-Za-z]\\w{2,}@\\w{2,}(\\.[a-z]{2,3})+";
		
		String s = sc.nextLine();
		
		System.out.println(s.matches(regex));

	}

}
