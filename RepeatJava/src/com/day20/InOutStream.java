package com.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InpuStream��OutStream��д�ļ��ı�׼д��
 * 		�Ը���һ���ļ�Ϊ��
 */

public class InOutStream {

	public static void main(String[] args) throws IOException  {
		//���ļ�����
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		//��д�ļ�
		//��һ�ַ�ʽ��һ���ֽڶ�д
		int ch = 0;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}

		//�ڶ��ַ�ʽ�������ַ������д��Ч�ʸ�
		byte[] arr = new byte[1024]; //1M�ռ�
		int len = 0;
		while((len=fis.read(arr))!=-1){
			fos.write(arr, 0, len);
		}
		//ע�⣺���ַ�ʽֻ��ѡ��һ���ڱ����У���һ�ζ�д���Ѿ�������ļ��ĸ���
		
		//����
		 fos.close();
		 fis.close();
	}

}