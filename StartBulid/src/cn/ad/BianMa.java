package cn.ad;

import java.io.IOException;

/*
====��ʮ����==================================
��java�У��ַ�����abcd�����ַ�����ab��á��ĳ�����һ���������ĸ��ַ���
����Ӧ���ֽ�����ͬ��һ������ռ�����ֽڡ�
����һ�����������������ֽ�����ȡ�Ӵ���
�磺���ڡ�ab��á������ȡ�����ֽڣ���ô�Ӵ�����ab�롰�㡱�ֵİ����
��ô�����Ҫ���������ȥ�ĸ��ֽھ��ǡ�ab�㡱��ȡ����ֽڻ��ǡ�ab�㡱.
*/
public class BianMa {

	public static void main(String[] args) throws IOException {
		String str = "ab���cdлл";

		
		int len = str.getBytes("gbk").length;		
		for(int x=0; x<len; x++){
			System.out.println("��ȡ"+(x+1)+"���ֽڽ���ǣ�"+cutStringByByte(str, x+1));
		}

	}
	public static String cutStringByByte(String str,int len) throws IOException{
		
		byte[] buf = str.getBytes("gbk");
		
		int count = 0;
		for(int x=len-1; x>=0; x--){
			if(buf[x]<0)
				count++;
			else
				break;
		}
		
		if(count%2==0)
			return new String(buf,0,len,"gbk");
		else
			return new String(buf,0,len-1,"gbk");
	}
}
