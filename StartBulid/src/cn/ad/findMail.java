package cn.ad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Iterator;

public class findMail {
/*====�ڰ���====================================
ȡ��һ���ı��ļ������е�email��ַ������ŵ������С�//������ʽ
^ ��ƥ������Ŀ�ʼλ�á�
\������һ���ַ����Ϊ�����ַ�������ֵ��
* ��ƥ��ǰһ���ַ���λ򼸴Ρ�
+ ��ƥ��ǰһ���ַ�һ�λ��Ρ�
(pattern) ��ģʽƥ�䲢��סƥ�䡣
x|y��ƥ�� x �� y��
[a-z] ����ʾĳ����Χ�ڵ��ַ�����ָ�������ڵ��κ��ַ�ƥ�䡣
\w �����κε����ַ�ƥ�䣬�����»��ߡ�

{n,m} ����ƥ�� n �������ƥ�� m ��
$ ��ƥ������Ľ�β��

*/
	public static void main(String[] args) throws Exception {
		File fd = new File("C:\\mail.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(fd));
		
		ArrayList<String> sb = new ArrayList<>();
		String pattern = "\\w+@\\w+(\\.\\w+)+";  //����ʵ������޸�  ת���ַ�  \\ = \
		
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
