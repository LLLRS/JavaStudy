package com.day06;
//�žų˷���

public class Chengfabiao {

	public static void main(String[] args) {
		int[][] arr = new int[9][];
		//����һ����ά����
		for(int i=0;i<9;i++)
			arr[i] = new int[i+1];
		
		for(int i=1;i<=9;i++){			
			for(int j=1;j<=arr[i-1].length;j++){
				
				System.out.print(j+"X"+i+"="+j*i+"  ");				
			}	
			System.out.println();
		}
		
	}

}
