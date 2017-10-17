package cn.net.tcp.mytest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class myServer {

	public static void main(String[] args) throws IOException {
		/*
		 * 转换客户端:
		 * 1,创建socket客户端对象。
		 * 2,获取键盘录入。
		 * 3，将录入的信息发送给socket输出流。
		 */
	   ServerSocket ss = new ServerSocket(10012);
		
       Socket s = ss.accept();
       String ip = s.getInetAddress().getHostAddress();
       
       System.out.println(ip+"......connected");
       InputStream in = s.getInputStream();
       
       byte[] buf = new byte[1024];
       OutputStream out = s.getOutputStream();
       
       int len = 0;
       while(( len = in.read(buf))!=-1) {
    	   
    	   String line = new String(buf,0,len);
    	   
    	   System.out.println(line);
    	   out.write("sucess".getBytes());
//    	   out.write(line.toUpperCase().getBytes());
       }
       
       
       s.close();
       ss.close();
       
	}

}
