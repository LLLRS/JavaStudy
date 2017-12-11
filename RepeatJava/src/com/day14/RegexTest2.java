package com.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Pattern 和 Matcher 的获取功能
 * 	例如： 获取由三个字符组成的单词
 * */
public class RegexTest2 {

	public static void main(String[] args) {
		String s = "da jia ting wo shuo jin tian yao xia yu bu shang wan zi xi gao xing bu";
		//注意单词边界
		String regex = "\\b\\w{3}\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find()){
			System.out.print(m.group()+" ");
		}
		
	}

}
