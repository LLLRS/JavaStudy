package regex.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * ��ҳ���棺��ʵ��һ�����������ڻ������л�ȡ����ָ����������ݡ� 
 * 
 * ��ȡ�����ַ�� 
 * 
 */
public class RegexTest2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		
		List<String> list = getMailsByWeb();
		
		for(String mail : list){
			System.out.println(mail);
		}
	}
	
	public static List<String> getMailsByWeb() throws IOException {
		
		//1��ȡԴ�ļ�				
		
		URL url = new URL("http://blog.sina.com.cn/s/blog_515617e60101e151.html");
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(url.openStream()));
				
		//2�Զ�ȡ�����ݽ��й����ƥ��,���л�ȡ���Ϲ��������
		String mail_regex = "\\w+@\\w+(\\.\\w+)+";
		
		List<String> list = new ArrayList<String>();
		
		
		Pattern p = Pattern.compile(mail_regex);
		
		String line = null;
		
		while((line=bufIn.readLine())!=null){
			
			Matcher m = p.matcher(line);
			while(m.find()){
				//3�����Ϲ�������ݴ洢�������С�
				list.add(m.group());
			}
			
		}
		return list;
	}

	public static List<String>  getMails() throws IOException{
		
		//1��ȡԴ�ļ���
		BufferedReader bufr = new BufferedReader(new FileReader("c:\\mail.txt"));
		
		//2�Զ�ȡ�����ݽ��й����ƥ�䡣���л�ȡ���Ϲ��������.
		String mail_regex = "\\w+@\\w+(\\.\\w+)+";
		
		List<String> list = new ArrayList<String>();
		
		
		Pattern p = Pattern.compile(mail_regex);
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			Matcher m = p.matcher(line);
			while(m.find()){
				//3�����Ϲ�������ݴ洢�������С�
				list.add(m.group());
			}
			
		}
		bufr.close();
		
		return list;
		
	}

}
