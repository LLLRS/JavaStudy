package io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



/*ע�⣺һ��Ҫ�����ļ�·��
 * 
 * �������ļ��е�����
 *
 */
public class Move {

	private static final String PATH = "F:\\byrbt\\��׿�̳�\\��׿���Ļ���\\day10";

	
	public static void main(String[] args) throws Exception {
			
		File dir = new File(PATH);
		File[] files = dir.listFiles();
		
		for(File temp : files){
			if(temp.isDirectory()){
				File di = new File(PATH+"\\"+temp.getName());
				File[] file = di.listFiles();
				for(File tem : file){
					FileReader fr = new FileReader(tem.getAbsolutePath());

					FileWriter fw = new FileWriter(PATH+"\\"+tem.getName());
					
					int ch = 0;
					while((ch=fr.read())!=-1){
						fw.write((char)ch);
					}

					fw.close();
					fr.close();
					
				}
			}
			
		}
		System.out.println("over");	
	}
		
}


