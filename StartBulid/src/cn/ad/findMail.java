package cn.ad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Iterator;

public class findMail {
/*====第八题====================================
取出一个文本文件中所有的email地址，并存放到集合中。//正则表达式
^ ：匹配输入的开始位置。
\：将下一个字符标记为特殊字符或字面值。
* ：匹配前一个字符零次或几次。
+ ：匹配前一个字符一次或多次。
(pattern) 与模式匹配并记住匹配。
x|y：匹配 x 或 y。
[a-z] ：表示某个范围内的字符。与指定区间内的任何字符匹配。
\w ：与任何单词字符匹配，包括下划线。

{n,m} 最少匹配 n 次且最多匹配 m 次
$ ：匹配输入的结尾。

*/
	public static void main(String[] args) throws Exception {
		File fd = new File("C:\\mail.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(fd));
		
		ArrayList<String> sb = new ArrayList<>();
		String pattern = "\\w+@\\w+(\\.\\w+)+";  //根据实际情况修改  转义字符  \\ = \
		
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = null;
		
		String line = null;
		while((line=br.readLine())!=null) {
			m = p.matcher(line);
		    if(m.find())
		    	sb.add(line);
		    }
		
		Iterator<String> it = sb.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		br.close();
	}
	
}
