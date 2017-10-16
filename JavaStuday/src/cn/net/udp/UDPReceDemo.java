package cn.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		System.out.println("���ն�����......");
		/*
		 * ����UDP���ն˵�˼·��
		 * 1.����udp socket����,��Ϊ��Ҫ�������ݣ�����Ҫ��ȷһ���˿ںš�
		 * 2.�������ݰ������ڴ洢���յ������ݡ����������ݰ�����ķ���������Щ����.
		 * 3.ʹ��socket�����receive���������յ����ݴ洢�����ݰ��С�
		 * 4.ͨ�����ݰ��ķ����������ݰ��е����ݡ�
		 * 5.�ر���Դ 
		 */
		
//		udpRec_1();
		udpRec_2();
		
	}

	public static void udpRec_2() throws SocketException, IOException {
		//����udp socket����
		DatagramSocket ds = new DatagramSocket(10000);
		
		while(true){
		//�������ݰ���
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		
		//ʹ�ý��շ��������ݴ洢�����ݰ��С�
		ds.receive(dp);//����ʽ�ġ�
		
		//ͨ�����ݰ�����ķ������������е�����,���磬��ַ���˿ڣ��������ݡ�
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();//���Ͷ˶˿�
		String text = new String(dp.getData(),0,dp.getLength());
		
		System.out.println(ip+":"+port+":"+text);
	}
		//5,�ر���Դ��
//		ds.close();
}

		
		

	public static void udpRec_1() throws SocketException, IOException {
		//����udp socket����
		DatagramSocket ds = new DatagramSocket(10000);
		
		
		//�������ݰ���
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		
		//ʹ�ý��շ��������ݴ洢�����ݰ��С�
		ds.receive(dp);//����ʽ�ġ�
		
		//ͨ�����ݰ�����ķ������������е�����,���磬��ַ���˿ڣ��������ݡ�
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String text = new String(dp.getData(),0,dp.getLength());
		
		System.out.println(ip+":"+port+":"+text);
		
		//�ر���Դ��
		ds.close();
	}
	

}
