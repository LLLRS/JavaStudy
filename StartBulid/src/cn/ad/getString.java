package cn.ad;

/*====��ʮ����==================================
���������ַ�������ȡ�����ַ����������ͬ���Ӵ�.
"abcwerthelloyuiodef"
"cvhellobnm"

˼·��
1�����̵��Ǹ��Ӵ����ճ��ȵݼ��ķ�ʽ��ȡ����
2����ÿ��ȡ�����Ӵ�ȥ�������ж��Ƿ����������������Ѿ��ҵ�����
*/


public class getString {

	public static void main(String[] args) {
		
		String str2 = "abcwerthelloyuiodef";
		String str1 = "cvhellobnm";
		
		getStr(str1, str2);
			

	}

	public static void getStr(String str1, String str2) {
		
		String temp = null;
		//ȷ��str1�ǽϳ����ַ�����str2�ǽ϶̵��ַ��� ,���Ч��
		if(str1.length()<str2.length())
		{
			temp = str1;
			str1 = str2;
			str2 = temp;
		}
		for(int i=str2.length();i>=0;i--) {
			for(int j=0;j<=str2.length()-i;j++) {
				
				temp = str2.substring(j, j+i-1);
				if(str1.contains(temp)) {
					System.out.println(str1+"��"+str2+"����ִ��ǣ� "+temp);
					i = -1;  //������ѭ��
					break;
				}
			}
		}
		
//		System.out.println(str1+"��"+str2+"û����ִ�");
	}

}
