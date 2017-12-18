package com.day21;

import java.io.IOException;
import java.io.Reader;

//��Readerģ��BufferedReader��readLine()����
//�Զ�����ģ��LineNumberReader�����й���
//��ȡÿ�ζ�ȡ���ݵ��к�

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
			
			//window�Ļ�����\r\n�����ַ�
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
		//������һ�в����Ի��н�β
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
