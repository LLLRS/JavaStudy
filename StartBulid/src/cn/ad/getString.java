package cn.ad;

/*====第十四题==================================
给定两个字符串，获取两个字符串中最大相同的子串.
"abcwerthelloyuiodef"
"cvhellobnm"

思路：
1，将短的那个子串按照长度递减的方式获取到。
2，将每获取到的子串去长串中判断是否包含，如果包含，已经找到！。
*/


public class getString {

	public static void main(String[] args) {
		
		String str2 = "abcwerthelloyuiodef";
		String str1 = "cvhellobnm";
		
		getStr(str1, str2);
			

	}

	public static void getStr(String str1, String str2) {
		
		String temp = null;
		//确保str1是较长的字符串，str2是较短的字符串 ,提高效率
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
					System.out.println(str1+"和"+str2+"的最长字串是： "+temp);
					i = -1;  //跳出外循环
					break;
				}
			}
		}
		
//		System.out.println(str1+"和"+str2+"没有最长字串");
	}

}
