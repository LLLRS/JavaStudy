package cn.net.tcp.mytest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class myClient {

	public static void main(String[] args) throws IOException {
		 /*
		 * 1，需要先有socket端点。
		 * 2，客户端的数据源：键盘。
		 * 3，客户端的目的：socket.
		 * 4，接收服务端的数据，源：socket。
		 * 5，将数据显示在打印出来：目的：控制台.
		 * 6，在这些流中操作的数据，都是文本数据。
		 * */
		
		Socket s = new Socket("PC-LLRS",10012);
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader
										(new FileInputStream("C:/up.txt")));
		
		OutputStream out = s.getOutputStream();
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];	
		String line = null;
		
		while((line =bufr.readLine())!= null) {
//			if("over".equals(line))
//				break;
			out.write(line.getBytes());
	
		}
		
		int len = in.read(buf);
		String  text = new String(buf,0,len);			
		System.out.println(text);
		
		s.close();

	}

}
