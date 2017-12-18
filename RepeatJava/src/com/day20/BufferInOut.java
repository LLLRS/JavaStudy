package com.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节缓冲输出流：BufferedInputStream和BufferedOutputStream
 */
public class BufferInOut {

	public static void main(String[] args) throws IOException {
		
		//与文件关联
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
		
		
		//读写文件
		//第一种方式：一个字节读写
		int ch = 0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
		}
		
		//第二种方式：利用字符数组读写，效率高
		byte[] arr = new byte[1024]; //1M空间
		int len = 0;
		while((len=bis.read(arr))!=-1){
			bos.write(arr, 0, len);
		}
		//注意：两种方式只能选其一，在本例中，第一次读写都已经完成了文件的复制
		
		//关流
		 bos.close();
		 bis.close();

	}

}
