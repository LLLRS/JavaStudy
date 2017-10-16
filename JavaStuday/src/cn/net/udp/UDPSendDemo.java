package cn.net.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		System.out.println("发送端启动......");
		/*
		 * 创建UDP传输的发送端。
		 * 思路：
		 * 1.建立udp的socket服务。
		 * 2.将要发送的数据封装到数据包中。 
		 * 3.通过udp的socket服务将数据包发送出去。
		 * 4.关闭socket服务。
		 */
//		udpSend_1();
		udpSend_2();
		
	}

	public static void udpSend_1() throws SocketException, UnknownHostException, IOException {
		//udpsocket服务。使用DatagramSocket对象。
		DatagramSocket ds = new DatagramSocket(8888);
		
		//将要发送的数据封装到数据包中。
		String str = "udp传输演示：哥们来了！";
		
		//使用DatagramPacket将数据封装到的该对象包中。
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = 
				new DatagramPacket(buf,buf.length,InetAddress.getByName("PC-LLRS"),10000);
		
		
		//通过udp的socket服务将数据包发送出去。使用send方法。
		ds.send(dp);
		
		//关闭资源。
		ds.close();
	}

	
	public static void udpSend_2() throws SocketException, IOException, UnknownHostException {
		
		DatagramSocket ds = new DatagramSocket(8888);
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			
			byte[] buf = line.getBytes();
			DatagramPacket dp = 
					new DatagramPacket(buf,buf.length,InetAddress.getByName("PC-LLRS"),10000);
			ds.send(dp);
			
			if("886".equals(line))
				break;
		}
		
		ds.close();
	}

}
