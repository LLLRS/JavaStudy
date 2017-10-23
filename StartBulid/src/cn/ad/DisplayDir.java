package cn.ad;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*====������====================
��дһ�����򣬵��û�����һ��Ŀ¼ʱ��
�ó������г���Ŀ¼�µ�������Ŀ¼���ļ���
ȡ��D:����ȫ����.java�ļ����ļ�·��������java.txt�ļ���
*/
public class DisplayDir {
	
	public static ArrayList<String> sb = null;
	public static void main(String[] args) throws IOException {
//		StringBuilder sb = null;
		
		String path = "E:\\360Downloads";
		
		File dir = new File(path);
		if(!dir.exists()) 
			throw new RuntimeException("���ļ��в�����");
		
//		int value = 0;
//		System.out.println(dir.getName());
//		findFileAndDir(dir,value);
		
		sb =  new ArrayList<String>();
		getXmlAbsolutePath(dir);
	}

	/**
	 * @param dir
	 * @throws IOException
	 */
	public static void getXmlAbsolutePath(File dir) throws IOException {
		
		File fd = new File("xml.txt");
		if(!fd.exists()) 
			fd.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fd));

		findFilesAbsolutePath(dir,"xml");
		
		for(String s:sb) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		bw.close();
		
	}

	public static void findFilesAbsolutePath(File dir,String suffix) throws IOException {
		
		File[] files = dir.listFiles();//new SuffixFilter(suffix)

		for(int i= 0;i<files.length;i++) {
			
			if(files[i].isDirectory()) {	
			
				findFilesAbsolutePath(files[i],suffix);				
			}
			else if(files[i].getName().endsWith(suffix)) {
				sb.add(files[i].getAbsolutePath());
			}
			else
				continue;
		}
		
	}

	public static void findFileAndDir(File dir,int value) {
		
		File[] files = dir.listFiles();
		value++;
//		for(int k =0;k< value; k++)
//			System.out.println("--|");
		

		
		for(int i= 0;i<files.length;i++) {
			
			if(files[i].isDirectory()) {	
				
				for(int k =0;k< value; k++) 
					System.out.print("--|");
				System.out.println(files[i].getName());
				findFileAndDir(files[i],value);				
			}
			else {
				for(int k =0;k< value; k++) 
					System.out.print("--|");
					System.out.println(files[i].getName());

			}
		}
	
	}

}
