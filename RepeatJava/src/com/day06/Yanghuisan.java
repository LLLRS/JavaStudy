package com.day06;

import java.util.Scanner;


//打印杨辉三角形(行数可以键盘录入)
public class Yanghuisan {

	public static void main(String[] args) 
	   {
	       
		  Scanner in = new Scanner(System.in);
	      int NMAX = in.nextInt(); 
	      
	      int[][] odds = new int[NMAX + 1][];
	      for (int n = 0; n <= NMAX; n++)
	         odds[n] = new int[n + 1];  
	 
	      for (int n = 0; n < odds.length; n++)
	         for (int k = 0; k < odds[n].length; k++)
	         {
	            /*
	             * 第n行的m个数可表示为 C(n-1，m-1)，即为从n-1个不同元素中取m-1个元素的组合数。
	             */
	            int lotteryOdds = 1;
	            for (int i = 1; i <= k; i++)
	               lotteryOdds = lotteryOdds * (n - i + 1) / i;
	 
	            odds[n][k] = lotteryOdds;
	         }
	 
	      // print
	      for (int[] row : odds)
	      {
	         for (int odd : row)
	            System.out.printf("%4d", odd);
	         System.out.println();
	      }
	      in.close();
	   }

}
