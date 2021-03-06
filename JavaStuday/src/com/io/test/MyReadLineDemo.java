package io.test;

import java.io.IOException;
import java.io.Reader;

/**
 * 定义一个自己的readline方法
 * 
 * 装饰设计:
 * */


public class MyReadLineDemo extends Reader {
	
	private Reader r;
	char[] buf = new char[1024];
	//定义一个计数器用于记录缓冲区中的数据个数 当该数据减到0，就从源中继续获取数据到缓冲区中。
	private int count = 0;
	//定义一个指针用于操作这个数组中的元素。当操作到最后一个元素后，指针应该归零。	
	private int pos = 0;
	MyReadLineDemo(Reader r){		
		this.r = r;
	}
	
	public int MyRead() throws IOException  {
		if(count == 0)
		{
			count = r.read(buf); //将字符读入数组 public int read(char[] cbuf
			pos = 0;
		}
		if(count < 0)
			return -1;
		count --;
		return buf[pos++];
		
	}
	
	public String MyReadLine() throws IOException  {
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch = MyRead())!=-1) {
			if(ch=='\r')
				continue;
			if(ch=='\n')			
				return sb.toString();
			sb.append((char)ch);
		}
		//万一就一行或者为空
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void close() throws IOException {
		r.close();		
	}
	
	public void MyClose() throws IOException {
		r.close();		
	}

}
