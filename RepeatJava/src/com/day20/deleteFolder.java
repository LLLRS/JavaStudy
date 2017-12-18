package com.day20;

import java.io.File;
//删除指定目录：
// 注意：如果文件夹里有文件或者文件夹，直接用delete方法是删不掉的。
public class deleteFolder {

	public static void main(String[] args) {
		
		File dir = new File("要删除的目录");
		
		deleteFold(dir);

	}

	public static void deleteFold(File dir) {
		File[] files = dir.listFiles();
		
		for(int i=1;i<files.length;i++){
			if(files[i].isDirectory()){
				deleteFold(files[i]);
			}else{
				
			System.out.println("Delete:"+files[i].getName()+" : "+files[i].delete());
			}
		}
		
		System.out.println("Delete:"+dir.getName()+" : "+dir.delete());
	}

}
