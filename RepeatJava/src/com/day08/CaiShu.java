package com.day08;
//����С��Ϸ

import java.util.Scanner;

public class CaiShu {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100)+1;
		//System.out.println(num);
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����(1-100)��");
		
		while(true){

			int t = in.nextInt();
			if(t>num){
				System.out.println("�µ������ˣ�����������һ����(1-100)��");
			}
			else if(t<num){
				System.out.println("�µ���С�ˣ�����������һ����(1-100)��");
			}
			else{
				System.out.println("�¶��ˣ�");
				break;
			}

		}
		in.close();
	}

}
