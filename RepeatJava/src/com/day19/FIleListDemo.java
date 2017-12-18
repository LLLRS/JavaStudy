package com.day19;

import java.io.File;
import java.io.FilenameFilter;

public class FIleListDemo {

	public static void main(String[] args) {
		File f = new File("F:\\byrbt\\2015年Java基础视频_深入浅出精华版\\day01\\code");
		
		String[] list = f.list(new  FilenameFilter(){

			@Override
			public boolean accept(File f, String s) {
				if(s.endsWith(".txt"))
					return true;
				return false;
			}
			
		});
		
		for(String s:list){
			System.out.println(s);
			
		}
		File[] ff = f.listFiles(new  FilenameFilter(){
			@Override
			public boolean accept(File f, String s) {
				if(s.endsWith(".txt"))
					return true;
				return false;
			}
			
		});
		
		for(File t:ff){
			if(t.isFile())
				System.out.println(t.getName());
		}
	}

}
