package cn.basedemo;
/*
 * 输出一个不规则数组
 * 
 * */
public class Array {
	public static void main(String[] args) {
		final int NMAX = 9;
		int [][] odds = new int[NMAX+1][];
		
		for (int n = 0;n<odds.length;n++)
			odds[n] = new int[n+1];
		
		for (int n = 0;n<odds.length;n++)
			for(int k = 0;k<odds[n].length;k++)
				for(int i = 0;i<=k;i++)
					odds[n][k]=i+1;
		/* for 传统 
         for (int n = 0;n<odds.length;n++)
         {
			for(int k = 0;k<odds[n].length;k++)
        		 System.out.printf("%4d",odds[n][k]);
        	 System.out.println();
         }	
		 */
		//for each语句
         for(int[] row : odds)
         {
        	 for(int odd : row)
        		 System.out.printf("%4d",odd);
        	 System.out.println();
         }		
	}
}
