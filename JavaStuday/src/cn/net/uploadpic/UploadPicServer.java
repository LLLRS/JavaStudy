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
			
		//创建tcp的socket服务端。
		ServerSocket ss = new ServerSocket(10006);
		
		while(true){
			Socket s = ss.accept();	//阻塞式		
			//实现多个客户端上传，并发访问
			new Thread(new UploadTask(s)).start();		
			
		}
		
		
		
//		ss.close();
		
		
	}

}
