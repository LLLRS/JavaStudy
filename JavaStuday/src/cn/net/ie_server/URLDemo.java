package cn.net.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	/**
	 * @param args
	 * @throws IOException 

	 */
	public static void main(String[] args) throws IOException {
		
		   //获取本地主机ip地址对象。 
//			InetAddress ip = InetAddress.getLocalHost();	
//			System.out.println(ip.getHostAddress());
		
		
		String str_url = "http://10.108.171.100:8080/myweb/1.html?name=lisi";
		
		URL url = new URL(str_url);
		
//		System.out.println("getProtocol:"+url.getProtocol());
//		System.out.println("getHost:"+url.getHost());
//		System.out.println("getPort:"+url.getPort());
//		System.out.println("getFile:"+url.getFile());
//		System.out.println("getPath:"+url.getPath());
//		System.out.println("getQuery:"+url.getQuery());
		
//		InputStream in = url.openStream();
		
		//获取url对象的Url连接器对象。将连接封装成了对象:java中内置的可以解析的具体协议的对象+socket.
		URLConnection conn = url.openConnection();
		
		String value = conn.getHeaderField("Date");
		System.out.println(value);
		
		System.out.println(conn);
	
//		InputStream in = conn.getInputStream();
//		
//		byte[] buf = new byte[1024];
//		int len = in.read(buf);	
//		String text = new String(buf,0,len);		
//		System.out.println(text);
//		
//		in.close();
		
		
	}

}
