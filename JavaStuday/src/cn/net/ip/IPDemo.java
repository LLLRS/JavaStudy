package cn.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {

		//获取本地主机ip地址对象。 
		InetAddress ip = InetAddress.getLocalHost();
		
		//获取其他主机的ip地址对象。
//		ip = InetAddress.getByName("baidu.com");//PC-LLRS 169.254.175.50
	
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
	}

}
