package com.day20;
//½×³Ë
public class DiGui {

	public static void main(String[] args) {
		
		
		int t = JieCehng(5);
		System.out.println(t);

	}

	private static int JieCehng(int i) {
		
		if(i==1||i==0)
			return 1;
		
		return i*JieCehng(i-1);
	}

}
