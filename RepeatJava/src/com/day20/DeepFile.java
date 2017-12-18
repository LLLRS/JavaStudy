package com.day20;

import java.io.File;
import java.util.ArrayList;

//��ȱ��������Ի�ȡһ���ļ�������Ŀ¼

public class DeepFile {

	public static ArrayList<String> arr = null;
	
	public static void main(String[] args) {
		File dir = new File("F:\\byrbt\\2015��Java������Ƶ_����ǳ��������");
		
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
