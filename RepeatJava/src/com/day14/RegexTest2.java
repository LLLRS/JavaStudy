package com.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Pattern �� Matcher �Ļ�ȡ����
 * 	���磺 ��ȡ�������ַ���ɵĵ���
 * */
public class RegexTest2 {

	public static void main(String[] args) {
		String s = "da jia ting wo shuo jin tian yao xia yu bu shang wan zi xi gao xing bu";
		//ע�ⵥ�ʱ߽�
		String regex = "\\b\\w{3}\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find()){
			System.out.print(m.group()+" ");
		}
		
	}

}
