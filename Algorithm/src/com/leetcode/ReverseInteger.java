package com.leetcode;

import java.math.BigInteger;

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
		//System.out.println(reverse(2147483641));
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(myAtoi("9646324350"));
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
	        System.out.println(s);
	        return myAtoi(s);
	    }
//	convert a string to an integer.
	 public static int myAtoi(String str) {
		 if (str == null || str.length() == 0)
				return 0;//
			str = str.trim();
			char firstChar = str.charAt(0);
			int sign = 1, start = 0, len = str.length();
			long sum = 0;
			if (firstChar == '+') {
				sign = 1;
				start++;
			} else if (firstChar == '-') {
				sign = -1;
				start++;
			}
			for (int i = start; i < len; i++) {
				if (!Character.isDigit(str.charAt(i)))
					return (int) sum * sign;
				sum = sum * 10 + str.charAt(i) - '0';
				if (sign == 1 && sum > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}

			return (int) sum * sign;
	        
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
