package cn.net.uploadpic;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class UploadPicServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
			
		//����tcp��socket����ˡ�
		ServerSocket ss = new ServerSocket(10006);
		
		while(true){
			Socket s = ss.accept();	//����ʽ		
			//ʵ�ֶ���ͻ����ϴ�����������
			new Thread(new UploadTask(s)).start();		
			
		}
		
		
		
//		ss.close();
		
		
	}

}
