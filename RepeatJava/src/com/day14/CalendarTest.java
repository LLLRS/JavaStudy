package com.day14;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 获取任意一年的二月有多少天
 *   思路：先设置为那一年的3月1日，然后往前推一天即可
 * 
 * */
public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入要查找的年份：");
		int year = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		//月从0开始计数的
		c.set(year, 2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println(year+"年的二月有"+c.get(Calendar.DAY_OF_MONTH)+"天");
		
	}

}
