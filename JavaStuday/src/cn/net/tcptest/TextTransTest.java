package cn.net.tcptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TextTransTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {

		/*
		 * 客户端输入字母数据，发送给服务端，
		 * 服务端收到后显示在控制台，并将该数据转成大写返回给客户端 
		 * 直到客户端输入over.转换结束. 
		 * 
		 * 创建一个英文大写转换服务器.
		 * 
		 * 分析:
		 * 有客户端和服务端,使用tcp传输
		 * 
		 * 思路：
		 * 客户端：
		 * 1，需要先有socket端点。
		 * 2，客户端的数据源：键盘。
		 * 3，客户端的目的：socket.
		 * 4，接收服务端的数据，源：socket。
		 * 5，将数据显示在打印出来：目的：控制台.
		 * 6，在这些流中操作的数据，都是文本数据。
		 * 
		 * 
		 * 转换客户端:
		 * 1,创建socket客户端对象。
		 * 2,获取键盘录入。
		 * 3，将录入的信息发送给socket输出流。
		 */
		
//		test();
	}

	public static void test() throws UnknownHostException, IOException {
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		Socket socket = new Socket("PC-LLRS",10007);
	
		OutputStream out = socket.getOutputStream();	
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			if("over".equals(line))
				break;
		
			out.write(line.getBytes());
			
			//////
			InputStream in = socket.getInputStream();
			byte[] buf = new byte[1024];

			int len = in.read(buf);
			
			String  text = new String(buf,0,len);
			
			System.out.println(text);
		
			
		}
	
		socket.close();
	}

}
