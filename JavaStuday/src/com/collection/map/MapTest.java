package collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



/*
 * ��ϰ:
 * "fdgavcbsacdfs" ��ȡ���ַ����У�ÿһ����ĸ���ֵĴ�����
 * Ҫ���ӡ����ǣ�a(2)b(1)...;
 * ˼·��
 * ���ڽ���ķ������֣���ĸ�ʹ���֮�������ӳ��Ĺ�ϵ���������ֹ�ϵ�ܶࡣ
 * �ܶ����Ҫ�洢���ܴ洢ӳ���ϵ�������������Map���ϡ�
 * ��ϵһ��ʽ��������û�У�(�еĻ����������� )
 * �Ǿ�ʹ��Map���ϡ� �ַ��ֿ��Ա�֤Ψһ�Ե�һ���߱���˳���� a b c ...
 * ���Կ���ʹ��TreeMap���ϡ�
 * 
 * �����������Ӧ�ô洢������ĸ�ʹ����Ķ�Ӧ��ϵ�� 
 * 
 * ***˼·����Ҫ***
 * 1����Ϊ���������ַ����е���ĸ�������Ƚ��ַ�������ַ����顣
 * 2�������ַ����飬��ÿһ����ĸ��Ϊ��ȥ��Map���������
 * �������ĸ�������ڣ��ͽ�����ĸ��Ϊ�� 1��Ϊֵ�洢��map�����С�
 * �������ĸ�����ڣ��ͽ�����ĸ����Ӧֵȡ����+1���ڽ�����ĸ��+1���ֵ�洢��map�����У�
 * ����ֵͬ�Ḳ�ǡ������ͼ�¼ס�˸���ĸ�Ĵ���.
 * 3������������map���Ͼͼ�¼������ĸ�ĳ��ֵĴ���.
 * 
 * 
 */


public class MapTest {

	public static void main(String[] args) {
		
		String str = "fdAga 1vS Dcb3s ac4dfs";
		//���ַ���ת��Ϊchar������
		//char[] chs = charArray(str);
		char[] chs = str.toCharArray(); // ����
		
		//�����ַ�����,��ӡ���
		String s = getMap(chs);
		
		System.out.println(s);
		
		
	}

	public static String getMap(char[] chs) {
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		for(int i=0;i<chs.length;i++) {
			if(!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z'))
//			if(!(Character.toLowerCase(chs[i])>='a' && Character.toLowerCase(chs[i])<='z'))
				continue;
			Integer value = tm.get(chs[i]);
			int count = 1;
			
			if(value != null)
				count = value + 1;
			
			tm.put(chs[i], count);
	
		}
		return mapPrint(tm);
	}
	
private static String mapPrint(TreeMap<Character, Integer> tm) {
	//����Ҫ�ѽ����ӡ����������Ҫ���һ���ض��ַ���
	StringBuilder sb = new StringBuilder();
	
	Set<Map.Entry<Character, Integer>>entrySet  = tm.entrySet();

	Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
	
	while(it.hasNext()){
		Map.Entry<Character, Integer> me = it.next();
		Character p = me.getKey();
		Integer va = me.getValue();
		sb.append(p+"("+va+")");
		//System.out.print(p+"("+va+")");
	
		}
	return sb.toString();
		
	}

//	private static void mapPrint(TreeMap<Character, Integer> tm) {
//
//		Iterator<Character> it = tm.keySet().iterator();
//		
//		while(it.hasNext()){
//			
//			Character key =  it.next();;
//			Integer va= tm.get(key);
//			System.out.println(key+"("+va+")");
//		}	
//	}
	
//	private static char[] charArray(String str) {
//		
//		char[] temp = new char[str.length()];
//		
//		str.getChars(0, str.length(), temp,0);
//		return temp;
//	}
	
	
}
