package cn.ad;

import java.util.ArrayList;


/*====��ʮ����==================================
��һ�����б�дһ�������������������һ���ַ��������Ƿ����ĳ���ַ���
������ڣ��򷵻�����ַ����ַ������е�һ�γ��ֵ�λ�ã���Ŵ�0��ʼ���㣩��
���򣬷���-1��Ҫ�������ַ�������ַ����Բ�����ʽ���ݴ��ݸ��÷�����
������������Ϊnull��Ӧ�׳�IllegalArgumentException�쳣��
�����main�������Ը��ֿ��ܳ��ֵ����������֤�÷�����д���Ƿ���ȷ��
���磬�ַ������ڣ��ַ����ڣ����������Ϊnull�ȡ� 
*/

public class lookChar {

	public static void main(String[] args) {
		
	
		char[] arr = {'a','b','c','e','k','o'};

		char ch = 'f';
		
		int i = lookMethod(ch,arr);

		System.out.println(i);
	}

	public static int lookMethod(char ch,char arr[]) {
		if(arr==null) 
			throw new RuntimeException("IllegalArgumentException");
		
		ArrayList<Character> sb = new ArrayList<>();
		
		for(char s:arr)
			sb.add(s);
		
		return sb.indexOf(ch);
	}

}
