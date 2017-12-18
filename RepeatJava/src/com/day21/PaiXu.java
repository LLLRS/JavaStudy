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
 * 	��֪s.txt�ļ�����������һ���ַ�������hcexfgijkamdnoqrzstuvwybpl��
 *	���д�����ȡ�������ݣ������������д��ss.txt��
*/

public class PaiXu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("s.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		
		TreeSet<Character> ts= new TreeSet<>();
		
		//������ֻһ��Ŷ�������˻���Arrays�������ṩ�˶��ֲ�������ķ���
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
