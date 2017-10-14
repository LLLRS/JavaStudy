package io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferMoveflieTest {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bufw = new BufferedWriter(new FileWriter("./src/com/io/iomovetestnew2.txt"));
		BufferedReader bufr = new BufferedReader(new FileReader("E:/JavaEclipse/JavaStuday/iomovetest.txt"));

		String line = null;
		
		while((line=bufr.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		bufw.close();
		bufr.close();
	}

}
