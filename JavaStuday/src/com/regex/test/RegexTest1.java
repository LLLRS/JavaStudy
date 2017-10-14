package regex.test;

import java.util.TreeSet;

/*
 * 1，治疗口吃(去重):我我...我我...我我我要...要要要要...要要要要..学学学学学...学学编编...编编编编..编..程程...程程...程程程
 * 2，对ip地址排序。 
 * 3，对邮件地址校验。 
 */


public class RegexTest1 {

	public static void main(String[] args) {
		test_3();
	}
	
	//对邮件地址校验。
	public static void test_3() {
		
		String mail = "abc1@sina.com.cn";
		
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
		
		regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1
					
		boolean b = mail.matches(regex);
		
		System.out.println(mail+":"+b);
	
	}
	/*
	 * ip地址排序。 
	 * 
	 * 192.168.10.34 127.0.0.1 3.3.3.3  105.70.11.55
	 */
	public static void test_2(){
		
		String ip_str = "192.168.10.34  127.0.0.1  3.3.3.3  15.70.11.55";
		
		
		//为了让ip可以按照字符串顺序比较，只要让ip的每一段的位数相同。
		//补零，按照每一位所需做多0进行补充。每一段都加两个0.
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");
//		System.out.println(ip_str);
		
		//然后每一段保留数字3位。
		ip_str = ip_str.replaceAll("0*(\\d{3})", "$1");
//		System.out.println(ip_str);
		
		
		//1，将ip地址切出。
		String[] ips = ip_str.split(" +");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String  ip : ips){
//			System.out.println(ip);
			ts.add(ip);
		}
		
		for(String ip : ts){
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
		
	}
	
	
	//去重
	public static void test_1() {
		
		
		String str = "我我我我...我我我要...要要要要...要要要要..学学学学学...学学编编...编编编编..编..程程...程程...程程程";
		
//		StringBuilder sb = new StringBuilder();
//		String[] temp = str.split("\\.+");
//		for(int i = 0;i<temp.length;i++)
//			sb.append(temp[i]);
//		str =sb.toString();

		str = str.replaceAll("\\.+", "");
		str = str.replaceAll("(.)\\1+", "$1");
	
		System.out.println(str);
	}

}
