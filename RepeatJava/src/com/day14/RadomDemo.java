package com.day14;

import java.util.Scanner;

//����Math.radom��������һ�����ⷶΧ�ڵ������

public class RadomDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���뿪ʼ��Χ��");
		int start = sc.nextInt();
		System.out.println("���������Χ��");
		int end = sc.nextInt();
		
		//����
		
		for(int i=0;i<100;i++){
			System.out.println((int)((end-start+1)*Math.random()+start));
		}

	}

}
