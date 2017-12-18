package com.day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*	复制单极文件夹
	复制单极文件夹中指定文件并修改文件名称
	复制多极文件夹
*/
public class CopyFloder {

	public static void main(String[] args) throws IOException {
		File sdir = new File("F:\\test\\demos");
		File ddir = new File("F:\\test\\test2");

//		copySingleFloder(sdir,ddir);
//		copySingleFloderAndFind(sdir,ddir);
		copyMultipleFloder(sdir,ddir);
		

	}

	//	复制多极文件夹
	public static void copyMultipleFloder(File sdir, File ddir) throws IOException {
		File[] fs = sdir.listFiles();
		BufferedInputStream bis = null; 
		BufferedOutputStream bos = null;
		
		//如果是文件夹，就在目的文件夹下创建该同名文件夹
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
		//关流
		 bos.close();
		 bis.close();
	}
	
	
	//	复制单极文件夹
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
			
		//关流
		 bos.close();
		 bis.close();
		}
		
	}
	
	
	//	复制单极文件夹中指定文件并修改文件名称
	public static void copySingleFloderAndFind(File sdir, File ddir) throws IOException {
		File[] fs = sdir.listFiles();
		BufferedInputStream bis = null; 
		BufferedOutputStream bos = null;
		File tp = new File(ddir.getAbsolutePath()+"\\"+sdir.getName());
		if(!tp.exists()) tp.mkdir();
		for(File f : fs){
			if(f.getName().endsWith(".java")){  //可以用FilenameFilter处理
				bis = new BufferedInputStream(new FileInputStream(f));
				bos = new BufferedOutputStream(new FileOutputStream(tp.getAbsolutePath()+"\\"+"java.java"));

				byte[] arr = new byte[1024];
				int len = 0;
				while((len=bis.read(arr))!=-1){
					bos.write(arr, 0, len);
				}
			}
		}
		//关流
		 bos.close();
		 bis.close();
	}
}
