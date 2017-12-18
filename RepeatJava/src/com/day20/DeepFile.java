package com.day20;

import java.io.File;
import java.util.ArrayList;

//深度遍历：可以获取一个文件下所有目录

public class DeepFile {

	public static ArrayList<String> arr = null;
	
	public static void main(String[] args) {
		File dir = new File("F:\\byrbt\\2015年Java基础视频_深入浅出精华版");
		
	    arr = new  ArrayList<>();
	    
		deepFind(dir);
		for(String s :arr){
			System.out.println(s);
		}

	}

	public static void deepFind(File dir) {

		File[] files = dir.listFiles();
		for(int i=1;i<files.length;i++){
			if(files[i].isDirectory()){
				deepFind(files[i]);
			}else{
				String s = files[i].getName();
				if(s.endsWith(".txt")){

					arr.add(files[i].getAbsolutePath());
				}
			}
		}

	}

	
}
