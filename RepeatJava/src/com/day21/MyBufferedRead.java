package com.day21;

import java.io.IOException;
import java.io.Reader;

//用Reader模拟BufferedReader的readLine()功能
//自定义类模拟LineNumberReader的特有功能
//获取每次读取数据的行号

public class MyBufferedRead {
	
	private Reader r;
	private int LineNumber;
	
	public MyBufferedRead(Reader r) {
		this.r = r;
		
	}
	
	public String myLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch=r.read())!=-1){
			
			//window的换行是\r\n两个字符
			if(ch=='\r'){
				continue;
			}
			if(ch=='\n'){
				LineNumber ++;
				return sb.toString();
			}else{
				sb.append((char)ch);
			}
		}
		//如果最后一行不是以换行结尾
		if(sb.length()>0){ 
			LineNumber ++;
			return sb.toString();
		}
		return null;
	}
	public int getLineNumber() {
		return LineNumber;
	}

	public void setLineNumber(int LineNumber){
		this.LineNumber = LineNumber;
	
	}
	public void close() throws IOException{
		r.close();
	}
}
