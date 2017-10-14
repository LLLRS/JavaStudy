package io.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class MyReadLineTest {

	public static void main(String[] args) throws Exception {
	
		FileReader fr = new FileReader("./src/com/io/buf.txt");
		MyReadLineDemo me = new MyReadLineDemo(fr);
		String line = null;
		
		while((line=me.MyReadLine())!=null){
			System.out.println(line);
		}
		me.MyClose();
	}

}
