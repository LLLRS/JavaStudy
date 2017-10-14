package io.demo;


//¸´ÖÆÒ»·ùÍ¼Æ¬

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {

		demo1();
	}

	public static void demo1() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:/JavaEclipse/JavaStuday/test.jpg");
		FileOutputStream fos = new FileOutputStream("./src/com/io/new.jpg");
		

		byte[] buf = new byte[1024];		
		int len = 0;
		
		while((len=fis.read(buf))!=-1){		
			fos.write(buf, 0, len);
		}	

		fis.close();
		fos.close();
	}
	public static void demo2() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:/JavaEclipse/JavaStuday/test.jpg");	
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("./src/com/io/new.jpg");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
	
		
		int ch = 0;
		
		while((ch=bufis.read())!=-1){
			bufos.write(ch);
		}
		
		bufos.close();
		bufis.close();
	}

}
