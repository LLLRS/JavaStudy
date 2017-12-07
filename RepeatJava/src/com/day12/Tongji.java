package com.day12;

//统计一个字符串中大小写，数字的个数

public class Tongji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello1W12lD";
		
		int d = 0;
		int x = 0;
		int ss = 0;
		for (int i = 0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch>='0'&&ch<='9'){
				ss++;
			}else if(ch>='A'&&ch<='Z'){
				d++;
			}
			else if(ch>='a'&&ch<='z'){
				x++;
			}
			
		}
		
		System.out.println("大写 "+d+"  小写 "+x+"  数字 "+ss);
	}

}
