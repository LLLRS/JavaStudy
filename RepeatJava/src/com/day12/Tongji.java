package com.day12;

//ͳ��һ���ַ����д�Сд�����ֵĸ���

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
		
		System.out.println("��д "+d+"  Сд "+x+"  ���� "+ss);
	}

}
