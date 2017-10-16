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

		System.out.println("���Ͷ�����......");
		/*
		 * ����UDP����ķ��Ͷˡ�
		 * ˼·��
		 * 1.����udp��socket����
		 * 2.��Ҫ���͵����ݷ�װ�����ݰ��С� 
		 * 3.ͨ��udp��socket�������ݰ����ͳ�ȥ��
		 * 4.�ر�socket����
		 */
//		udpSend_1();
		udpSend_2();
		
	}

	public static void udpSend_1() throws SocketException, UnknownHostException, IOException {
		//udpsocket����ʹ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket(8888);
		
		//��Ҫ���͵����ݷ�װ�����ݰ��С�
		String str = "udp������ʾ���������ˣ�";
		
		//ʹ��DatagramPacket�����ݷ�װ���ĸö�����С�
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = 
				new DatagramPacket(buf,buf.length,InetAddress.getByName("PC-LLRS"),10000);
		
		
		//ͨ��udp��socket�������ݰ����ͳ�ȥ��ʹ��send������
		ds.send(dp);
		
		//�ر���Դ��
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
