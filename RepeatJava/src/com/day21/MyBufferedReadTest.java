package com.day21;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReadTest {

	public static void main(String[] args) throws IOException {
		
		MyBufferedRead me = new MyBufferedRead(new FileReader("ss.txt"));
		me.setLineNumber(10);
		String line = null;
		while((line=me.myLine())!=null){
			System.out.println(me.getLineNumber()+":"+line);
		}
		me.close();
	}
}
