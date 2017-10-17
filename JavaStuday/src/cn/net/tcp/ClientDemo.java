package cn.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//�ͻ��˷����ݵ������
		/*
		 * Tcp���䣬�ͻ��˽����Ĺ��̡�
		 * 1.����tcp�ͻ���socket����ʹ�õ���Socket����
		 * 		����ö���һ��������ȷĿ�ĵء�Ҫ���ӵ������� 
		 * 2.������ӽ����ɹ���˵�����ݴ���ͨ���ѽ�����
		 * 		��ͨ������socket��(����IO��) ,�ǵײ㽨���õġ� ��Ȼ������˵������������룬���������
		 * 		��Ҫ���������������󣬿�����Socket����ȡ�� 
		 * 		����ͨ��getOutputStream(),��getInputStream()����ȡ�����ֽ�����
		 * 3.ʹ���������������д���� 
		 * 4.�ر���Դ�� 
		 */

//		tcpClient_1();
		tcpClient_2();
		
	}

	public static void tcpClient_1() throws UnknownHostException, IOException {
		//�����ͻ���socket����
		Socket socket = new Socket("PC-LLRS",10002);
		
		//��ȡsocket���е�������� 
		OutputStream out = socket.getOutputStream();
		
		
		//ʹ���������ָ��������д��ȥ��
		out.write("tcp��ʾ������������!".getBytes());
		
		//�ر���Դ��
		socket.close();
	}
	
	
	public static void tcpClient_2() throws UnknownHostException, IOException {
		
		Socket socket = new Socket("PC-LLRS",10002);
		
		
		OutputStream out = socket.getOutputStream();	
		
		
		out.write("tcp��ʾ������������!".getBytes());
		
		
		
		//��ȡ����˷��ص�����,ʹ��socket��ȡ���� 
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String  text = new String(buf,0,len);
		
		System.out.println(text);
		
		//�ر���Դ��
		socket.close();
	}

}
