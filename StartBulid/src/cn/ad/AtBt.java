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

/*====第十六题==================================
已知文件a.txt文件中的内容为“bcdeadferwplkou”，
请编写程序读取该文件内容，并按照自然顺序排序后输出到b.txt文件中。
即b.txt中的文件内容应为“abcd…………..”这样的顺序。

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
