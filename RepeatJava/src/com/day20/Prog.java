package com.day20;


/*
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ�
 * �������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣�
 *  
 * ��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21.... 
*/

public class Prog {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("��"+n+"�����Ӷ����ǣ�"+JiShu(n));
	}

	public static int JiShu(int i) {
		if(i==1||i==2)
			return 1;
		return JiShu(i-1)+JiShu(i-2);
	}

}
