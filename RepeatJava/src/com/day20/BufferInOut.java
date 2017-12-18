package com.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽڻ����������BufferedInputStream��BufferedOutputStream
 */
public class BufferInOut {

	public static void main(String[] args) throws IOException {
		
		//���ļ�����
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
		
		
		//��д�ļ�
		//��һ�ַ�ʽ��һ���ֽڶ�д
		int ch = 0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
		}
		
		//�ڶ��ַ�ʽ�������ַ������д��Ч�ʸ�
		byte[] arr = new byte[1024]; //1M�ռ�
		int len = 0;
		while((len=bis.read(arr))!=-1){
			bos.write(arr, 0, len);
		}
		//ע�⣺���ַ�ʽֻ��ѡ��һ���ڱ����У���һ�ζ�д���Ѿ�������ļ��ĸ���
		
		//����
		 bos.close();
		 bis.close();

	}

}
