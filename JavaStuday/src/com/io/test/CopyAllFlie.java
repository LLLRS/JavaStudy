package io.test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;



/*ע�⣺һ��Ҫ�����ļ�·��
 * 
 * ��ȡָ��Ŀ¼�£�ָ����չ�����ļ�(������Ŀ¼�е�)
 * ��Щ�ļ��ľ���·��д�뵽һ���ı��ļ��С�
 * 
 * ��˵�����ǽ���һ��ָ����չ�����ļ����б� 
 * 
 * ˼·��
 * 1�����������ȱ�����
 * 2��Ҫ�ڱ����Ĺ����н��й��ˡ����������������ݶ��洢�������С�
 * 3���������е����ݽ��б�����������·��д�뵽�ļ��С� 
 * 
 *
 */
public class CopyAllFlie {

	private static final String PATH = "E:/byrbt/test/��ƵԴ��";
//	private static final String SOURCEDIR_PATH = "E:/byrbt/test/";  
	private static final String DESTDIR_PATH = "E:/byrbt/test";  
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
			
		File dir = new File(PATH);
		
		FilenameFilter filter = new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".rar");
			}			
		};
		
		List<File> list = new ArrayList<File>();
		
		getFiles(dir,filter,list);
		
//		File destFile = new File(dir,"javalist.txt");
		
//		writePathFile(list,destFile);
		
		moveFile(list);
//		unRarFile(list);
	}
	
	
	public static void moveFile(List<File> list)throws IOException{
			
			BufferedWriter bufw = null;
			BufferedReader bufr = null;

			
			for(File file : list){
				
				bufr = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
				bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(PATH+"/22222/"+file.getName())));
				
				String line = null;
				
				while((line=bufr.readLine())!=null){
					bufw.write(line);
					bufw.newLine();
					bufw.flush();
				}
				
				bufw.close();
				bufr.close();
			}
				
	}
	/**
	 * ��ָ��Ŀ¼�е����ݽ�����ȱ�����������ָ�������������й��ˣ�
	 * �����˺�����ݴ洢��ָ������List�С�
	 * @param dir
	 * @param filter
	 * @param list
	 */
	public static void getFiles(File dir,FilenameFilter filter,List<File> list){
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			if(file.isDirectory()){
				//�ݹ�����
				getFiles(file,filter,list);
			}else{
				//�Ա��������ļ����й������Ĺ��ˡ�����������File���󣬴洢��List�����С� 
				if(filter.accept(dir, file.getName())){
					list.add(file);
				}
			}
		}
		
	}
	
	public static void writePathFile(List<File> list,File destFile)throws IOException{
		
		BufferedWriter bufw = null;
		try {
			bufw = new BufferedWriter(new FileWriter(destFile));
			for(File file : list){
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
			
			
		} /*catch(IOException e){
			
			throw new RuntimeException("д��ʧ��");
		}*/finally{
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					
					throw new RuntimeException("�ر�ʧ��");
				}
		}
}



//public static void unRarFile(List<File> list)throws Exception{
//		
//	for(File file : list){
//		
//		 ZipRarUtil.deCompress(file.getAbsolutePath(), DESTDIR_PATH);
//		}
//	
//	}

}


