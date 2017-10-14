package io.demo;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("./src/com/io/buf.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
//		lnr.setLineNumber(100);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		
		lnr.close();
	}
}
