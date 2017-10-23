/**
 * 
 */
package cn.ad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

/*====��ʮ����==================================
��֪�ļ�a.txt�ļ��е�����Ϊ��bcdeadferwplkou����
���д�����ȡ���ļ����ݣ���������Ȼ˳������������b.txt�ļ��С�
��b.txt�е��ļ�����ӦΪ��abcd��������..��������˳��

*/

public class AtBt {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");
		if(!f1.exists()) f1.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(f1));
		
		File f2 = new File("b.txt");
		if(!f2.exists()) f2.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
		
		TreeSet<Character> ts = new TreeSet<>();
		String line = null;
		
		while((line=br.readLine())!=null){
			char[] temp = line.toCharArray();
			for(char s:temp)
				ts.add(s);
		}
		
		for(char s:ts) {
			
			bw.write(s);
//			bw.newLine();
			bw.flush();
			
		}
			
		
		br.close();
		bw.close();
	}

}
