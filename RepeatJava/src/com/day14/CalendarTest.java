package com.day14;

import java.util.Calendar;
import java.util.Scanner;

/*
 * ��ȡ����һ��Ķ����ж�����
 *   ˼·��������Ϊ��һ���3��1�գ�Ȼ����ǰ��һ�켴��
 * 
 * */
public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ҫ���ҵ���ݣ�");
		int year = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		//�´�0��ʼ������
		c.set(year, 2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println(year+"��Ķ�����"+c.get(Calendar.DAY_OF_MONTH)+"��");
		
	}

}
