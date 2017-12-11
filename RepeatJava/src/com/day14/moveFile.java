package com.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺶�ָ��Ŀ¼�����������ݵ��г���������Ŀ¼�е����ݣ�
 * Ҳ�������Ϊ ��ȱ�����
 * ���������ܽ�
 * 
 * 
 */
public class moveFile {

	public static void main(String[] args)throws IOException {

		File dir = new File("F:\\byrbt\\2015��Java������Ƶ_����ǳ��������");
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
				if(files[x].getName().endsWith("�ܽ�.txt")){
	
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
