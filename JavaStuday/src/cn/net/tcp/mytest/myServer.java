package cn.net.tcp.mytest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class myServer {

	public static void main(String[] args) throws IOException {
		/*
		 * ת���ͻ���:
		 * 1,����socket�ͻ��˶���
		 * 2,��ȡ����¼�롣
		 * 3����¼�����Ϣ���͸�socket�������
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
