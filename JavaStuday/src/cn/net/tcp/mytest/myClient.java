package cn.net.tcp.mytest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class myClient {

	public static void main(String[] args) throws IOException {
		 /*
		 * 1����Ҫ����socket�˵㡣
		 * 2���ͻ��˵�����Դ�����̡�
		 * 3���ͻ��˵�Ŀ�ģ�socket.
		 * 4�����շ���˵����ݣ�Դ��socket��
		 * 5����������ʾ�ڴ�ӡ������Ŀ�ģ�����̨.
		 * 6������Щ���в��������ݣ������ı����ݡ�
		 * */
		
		Socket s = new Socket("PC-LLRS",10012);
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader
										(new FileInputStream("C:/up.txt")));
		
		OutputStream out = s.getOutputStream();
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];	
		String line = null;
		
		while((line =bufr.readLine())!= null) {
//			if("over".equals(line))
//				break;
			out.write(line.getBytes());
	
		}
		
		int len = in.read(buf);
		String  text = new String(buf,0,len);			
		System.out.println(text);
		
		s.close();

	}

}
