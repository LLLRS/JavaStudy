package com.day20;

import java.io.File;
//ɾ��ָ��Ŀ¼��
// ע�⣺����ļ��������ļ������ļ��У�ֱ����delete������ɾ�����ġ�
public class deleteFolder {

	public static void main(String[] args) {
		
		File dir = new File("Ҫɾ����Ŀ¼");
		
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
