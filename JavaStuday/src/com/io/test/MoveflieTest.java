package io.test;

//�ƶ��ļ�
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MoveflieTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("E:/JavaEclipse/JavaStuday/iomovetest.txt");
//		StringBuilder sb = new StringBuilder();
		FileWriter fw = new FileWriter("./src/com/io/iomovetestnew.txt");
		int ch = 0;
		
		while((ch=fr.read())!=-1){
//			sb.append((char)ch);
			fw.write((char)ch);
//			fw.write(buf,0,len);
			//System.out.println((char)ch);
		}
		
//		fw.write(sb.toString());	//��ʱ�洢

		fw.close();
		fr.close();
	}

}
