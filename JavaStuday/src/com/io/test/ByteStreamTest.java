 package io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

//		demo_write(); 
		demo_read();
	}

	public static void demo_read() throws IOException {
		
		//1，创建一个读取流对象。和指定文件关联。
		FileInputStream fis = new FileInputStream("./src/com/io/bytedemo.txt");
		
//		System.out.println(fis.available());
//		byte[] buf = new byte[fis.available()];		
//		fis.read(buf);
//		System.out.println(new String(buf));
		
		
		//建议使用这种读取数据的方式
//		byte[] buf = new byte[1024];		
//		int len = 0;
//		
//		while((len=fis.read(buf))!=-1){
//			System.out.println(new String(buf,0,len));
//		}
		
		
//		int ch = 0;
//		while((ch=fis.read())!=-1){
//			System.out.println((char)ch);
//		}
		
		//一次读取一个字节。
//		int ch = fis.read();		
//		System.out.println(ch);
		
		fis.close();
		
	}

	public static void demo_write() throws IOException {
		
		//1，创建字节输出流对象。用于操作文件.
		FileOutputStream fos = new FileOutputStream("./src/com/io/bytedemo.txt");
		
		//2,写数据。直接写入到了目的地中。 
		fos.write("abcdefg".getBytes());
		
		fos.close();//关闭资源动作要完成。 
	}

}
