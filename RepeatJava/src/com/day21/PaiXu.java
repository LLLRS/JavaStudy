package com.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 	已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
 *	请编写程序读取数据内容，把数据排序后写入ss.txt中
*/

public class PaiXu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("s.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		
		TreeSet<Character> ts= new TreeSet<>();
		
		//方法不只一种哦，别忘了还有Arrays工具类提供了多种操作数组的方法
		String line = null;
		while((line=br.readLine())!=null){
			char[] arr = line.toCharArray();
			for(char ch : arr){
				ts.add(ch);
			}
		}
		
		Iterator<Character> it = ts.iterator();
		while(it.hasNext()){
			bw.write(it.next());
		}
		
		bw.close();
		br.close();
	}

}
