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
		 * �ͻ���������ĸ���ݣ����͸�����ˣ�
		 * ������յ�����ʾ�ڿ���̨������������ת�ɴ�д���ظ��ͻ��� 
		 * ֱ���ͻ�������over.ת������. 
		 * 
		 * ����һ��Ӣ�Ĵ�дת��������.
		 * 
		 * ����:
		 * �пͻ��˺ͷ����,ʹ��tcp����
		 * 
		 * ˼·��
		 * �ͻ��ˣ�
		 * 1����Ҫ����socket�˵㡣
		 * 2���ͻ��˵�����Դ�����̡�
		 * 3���ͻ��˵�Ŀ�ģ�socket.
		 * 4�����շ���˵����ݣ�Դ��socket��
		 * 5����������ʾ�ڴ�ӡ������Ŀ�ģ�����̨.
		 * 6������Щ���в��������ݣ������ı����ݡ�
		 * 
		 * 
		 * ת���ͻ���:
		 * 1,����socket�ͻ��˶���
		 * 2,��ȡ����¼�롣
		 * 3����¼�����Ϣ���͸�socket�������
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
