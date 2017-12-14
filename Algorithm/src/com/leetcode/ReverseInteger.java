package com.leetcode;


/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 *	Example 1:
 * 		Input: 123
 *		Output:  321
 *	Example 2:
 *		Input: -123
 *		Output: -321
 *	Example 3:
 *		Input: 120
 *		Output: 21
*/

public class ReverseInteger {

	public static void main(String[] args) {
		// test
		int t1 = 123;
		int t2 = 12000;
		int t3 = -123;
		
		System.out.println(reverse(t1));
		System.out.println(reverse(t2));
		System.out.println(reverse(t3));
		//System.out.println(Integer.parseInt("9646324350"));
		System.out.println(reverse(2147483641));
		System.out.println(Integer.MAX_VALUE);

	}
	public static int revers(int x) {
        
		
        
        return 0;
    }
	//该方法可能会超出范围
	public static int reverse(int x) {
	        
	        String s = String.valueOf(x);
	        
	        while(s.endsWith("0")){
	            s = s.substring(0,s.length()-1);
	        }
	        
	        if(s.startsWith("-")){
	             s = s.substring(1,s.length());
	             StringBuilder sb = new StringBuilder(s);
	             s = "-"+ sb.reverse().toString();
	        }
	        else{
	            StringBuilder sb = new StringBuilder(s);
	             s = sb.reverse().toString();
	        }
	        
	        return Integer.parseInt(s);
	    }
	
//	 public static int reverse(int x)
//	    {
//	        int result = 0;
//
//	        while (x != 0)
//	        {
//	            int tail = x % 10;
//	            int newResult = result * 10 + tail;
//	            if ((newResult - tail) / 10 != result)
//	            { return 0; }
//	            result = newResult;
//	            x = x / 10;
//	        }
//
//	        return result;
//	    }
}
