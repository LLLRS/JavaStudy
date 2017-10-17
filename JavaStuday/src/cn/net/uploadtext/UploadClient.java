package cn.net.uploadtext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("�ϴ��ͻ��ˡ�����������");
		
		File file = new File("c:\\mail.txt");
		System.out.println(file.exists());
		
		
	
		Socket s = new Socket("PC-LLRS",10005);
		

		BufferedReader bufr =
				new BufferedReader(new FileReader(file));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		
		String line = null;
		while((line=bufr.readLine())!=null){
			
			out.println(line);
		}
		
		//���߷���ˣ��ͻ���д���ˡ�
		s.shutdownOutput();
		out.println("!@#$%^&*(");
		
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = bufIn.readLine();
		System.out.println(str);
		
		bufr.close();
		s.close();
		
	}

}
