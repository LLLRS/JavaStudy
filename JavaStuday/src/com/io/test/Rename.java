package io.test;

import java.io.File;



/*ע�⣺һ��Ҫ�����ļ�·��
 * 
 * �������ļ��е�����
 *
 */
public class Rename {

	private static final String PATH = "F:\\byrbt\\����12��javeee+�Ƽ���+������";

	
	public static void main(String[] args) throws Exception {
			
		File dir = new File(PATH);
//		System.out.println(dir.isDirectory());
		File[] files = dir.listFiles();
		
//		System.out.println(files.length);
		String tem = null;
		for(File temp : files){
			tem = temp.getName();
			if(tem.endsWith("������Ƶ���Ϲ�ע΢�Ź��ںš�����Ҫ�ɡ�")){
			String[] t = tem.split("������Ƶ���Ϲ�ע΢�Ź��ںš�����Ҫ�ɡ�");
			System.out.println(temp.renameTo(new File(PATH+"\\"+t[0])));

			}
//			System.out.println(temp.getName());
		}
			
	}
		
}


