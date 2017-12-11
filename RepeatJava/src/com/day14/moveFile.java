package com.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：对指定目录进行所有内容的列出（包含子目录中的内容）
 * 也可以理解为 深度遍历。
 * 批量复制总结
 * 
 * 
 */
public class moveFile {

	public static void main(String[] args)throws IOException {

		File dir = new File("F:\\byrbt\\2015年Java基础视频_深入浅出精华版");
		listAll(dir);
		
//		File dir2 = new File("D:\\zz");
//		renameAll(dir2);
	}

	public static void renameAll(File dir) throws IOException {
		File[] files = dir.listFiles();
		for(int x=0; x<files.length; x++){
			
			String s = files[x].getName();
			
			FileInputStream fis = new FileInputStream(files[x].getAbsolutePath());  
	        BufferedInputStream bis = new BufferedInputStream(fis);  
	        FileOutputStream fos = new FileOutputStream("D:\\zzz\\"+s.substring(6));  
	        BufferedOutputStream bos = new BufferedOutputStream(fos);  
	        
	        int ch = 0;  
	          
	        while((ch=bis.read())!=-1){  
	            bos.write(ch);  
	        }  
	          
	        bis.close();  
	        bos.close();  
	        
	        System.out.println(files[x].getAbsolutePath());
		}
	}

	public static void listAll(File dir) throws IOException {
	
		File[] files = dir.listFiles();
		
		for(int x=0; x<files.length; x++){
			
			if(files[x].isDirectory()){
				listAll(files[x]);
			}
			else {
				if(files[x].getName().endsWith("总结.txt")){
	
			        FileInputStream fis = new FileInputStream(files[x].getAbsolutePath());  
			        BufferedInputStream bis = new BufferedInputStream(fis);  
			        FileOutputStream fos = new FileOutputStream("D:\\zzz\\"+files[x].getName());  
			        BufferedOutputStream bos = new BufferedOutputStream(fos);  
			        
			        int ch = 0;  
			          
			        while((ch=bis.read())!=-1){  
			            bos.write(ch);  
			        }  
			          
			        bis.close();  
			        bos.close();  
			        
			        System.out.println(files[x].getAbsolutePath());
				}
				
			}
		}	
	}

	

}
