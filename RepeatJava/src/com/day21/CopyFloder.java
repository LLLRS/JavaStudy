package com.day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*	���Ƶ����ļ���
	���Ƶ����ļ�����ָ���ļ����޸��ļ�����
	���ƶ༫�ļ���
*/
public class CopyFloder {

	public static void main(String[] args) throws IOException {
		File sdir = new File("F:\\test\\demos");
		File ddir = new File("F:\\test\\test2");

//		copySingleFloder(sdir,ddir);
//		copySingleFloderAndFind(sdir,ddir);
		copyMultipleFloder(sdir,ddir);
		

	}

	//	���ƶ༫�ļ���
	public static void copyMultipleFloder(File sdir, File ddir) throws IOException {
		File[] fs = sdir.listFiles();
		BufferedInputStream bis = null; 
		BufferedOutputStream bos = null;
		
		//������ļ��У�����Ŀ���ļ����´�����ͬ���ļ���
		File tp = new File(ddir.getAbsolutePath()+"\\"+sdir.getName());
		if(!tp.exists()) tp.mkdir();
		
		for(File f : fs){
			if(f.isDirectory()){	
				copyMultipleFloder(f.getAbsoluteFile(),tp);
			}else{
				bis = new BufferedInputStream(new FileInputStream(f));
				bos = new BufferedOutputStream(new FileOutputStream(tp.getAbsolutePath()+"\\"+f.getName()));

				byte[] arr = new byte[1024];
				int len = 0;
				while((len=bis.read(arr))!=-1){
					bos.write(arr, 0, len);
				}
				
			}
		}
		//����
		 bos.close();
		 bis.close();
	}
	
	
	//	���Ƶ����ļ���
	public static void copySingleFloder(File sdir, File ddir) throws IOException {
		File[] fs = sdir.listFiles();
		BufferedInputStream bis = null; 
		BufferedOutputStream bos = null;
		File tp = new File(ddir.getAbsolutePath()+"\\"+sdir.getName());
		if(!tp.exists()) tp.mkdir();
		for(File f : fs){
			bis = new BufferedInputStream(new FileInputStream(f));
			bos = new BufferedOutputStream(new FileOutputStream(tp.getAbsolutePath()+"\\"+f.getName()));
//			System.out.println(ddir.getAbsolutePath()+f.getName());
			byte[] arr = new byte[1024];
			int len = 0;
			while((len=bis.read(arr))!=-1){
				bos.write(arr, 0, len);
			}
			
		//����
		 bos.close();
		 bis.close();
		}
		
	}
	
	
	//	���Ƶ����ļ�����ָ���ļ����޸��ļ�����
	public static void copySingleFloderAndFind(File sdir, File ddir) throws IOException {
		File[] fs = sdir.listFiles();
		BufferedInputStream bis = null; 
		BufferedOutputStream bos = null;
		File tp = new File(ddir.getAbsolutePath()+"\\"+sdir.getName());
		if(!tp.exists()) tp.mkdir();
		for(File f : fs){
			if(f.getName().endsWith(".java")){  //������FilenameFilter����
				bis = new BufferedInputStream(new FileInputStream(f));
				bos = new BufferedOutputStream(new FileOutputStream(tp.getAbsolutePath()+"\\"+"java.java"));

				byte[] arr = new byte[1024];
				int len = 0;
				while((len=bis.read(arr))!=-1){
					bos.write(arr, 0, len);
				}
			}
		}
		//����
		 bos.close();
		 bis.close();
	}
}
