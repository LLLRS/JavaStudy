package com.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedChar {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt")); //Ä¬ÈÏ±àÂë¼¯gbk
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		String line = null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		br.close();
		bw.close();
	}
	
		

}
