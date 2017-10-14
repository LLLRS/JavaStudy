package regex.test;

import java.util.TreeSet;

/*
 * 1�����ƿڳ�(ȥ��):����...����...������Ҫ...ҪҪҪҪ...ҪҪҪҪ..ѧѧѧѧѧ...ѧѧ���...�����..��..�̳�...�̳�...�̳̳�
 * 2����ip��ַ���� 
 * 3�����ʼ���ַУ�顣 
 */


public class RegexTest1 {

	public static void main(String[] args) {
		test_3();
	}
	
	//���ʼ���ַУ�顣
	public static void test_3() {
		
		String mail = "abc1@sina.com.cn";
		
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
		
		regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1
					
		boolean b = mail.matches(regex);
		
		System.out.println(mail+":"+b);
	
	}
	/*
	 * ip��ַ���� 
	 * 
	 * 192.168.10.34 127.0.0.1 3.3.3.3  105.70.11.55
	 */
	public static void test_2(){
		
		String ip_str = "192.168.10.34  127.0.0.1  3.3.3.3  15.70.11.55";
		
		
		//Ϊ����ip���԰����ַ���˳��Ƚϣ�ֻҪ��ip��ÿһ�ε�λ����ͬ��
		//���㣬����ÿһλ��������0���в��䡣ÿһ�ζ�������0.
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");
//		System.out.println(ip_str);
		
		//Ȼ��ÿһ�α�������3λ��
		ip_str = ip_str.replaceAll("0*(\\d{3})", "$1");
//		System.out.println(ip_str);
		
		
		//1����ip��ַ�г���
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
	
	
	//ȥ��
	public static void test_1() {
		
		
		String str = "��������...������Ҫ...ҪҪҪҪ...ҪҪҪҪ..ѧѧѧѧѧ...ѧѧ���...�����..��..�̳�...�̳�...�̳̳�";
		
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
