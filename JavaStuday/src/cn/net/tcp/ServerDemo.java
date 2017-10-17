package cn.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		����˽��տͻ��˷��͹��������ݣ�����ӡ�ڿ���̨�ϡ� 
		/*
		 * ����tcp����˵�˼·��
		 * 1.���������socket����ͨ��ServerSocket����
		 * 2.����˱�������ṩһ���˿ڣ�����ͻ����޷����ӡ�
		 * 3.��ȡ���ӹ����Ŀͻ��˶���
		 * 4.ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷��������� 
		 * 		����ӡ�ڿ���̨�ϡ�
		 * 5.�ر���Դ���ؿͻ��ˣ��ط���ˡ� 
		 */
		
//		tcpServer_1();
		tcpServer_2();
		
		
	}

	public static void tcpServer_1() throws IOException {
		//��������˶���
		ServerSocket ss = new ServerSocket(10002);
		
		//��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();//����ʽ.
		
		String ip = s.getInetAddress().getHostAddress();
		
		//ͨ��socket�����ȡ��������Ҫ��ȡ�ͻ��˷���������
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+":"+text);
		
		s.close();
		ss.close();
	}
	
	
	public static void tcpServer_2() throws IOException {
		//��������˶���
		ServerSocket ss = new ServerSocket(10002);
		
		//��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		
		//ͨ��socket�����ȡ��������Ҫ��ȡ�ͻ��˷���������
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+":"+text);
		

		//ʹ�ÿͻ���socket�������������ͻ��˷�������
		OutputStream out = s.getOutputStream();
		out.write("�յ�".getBytes());
		
		s.close();
		ss.close();
	}

}
