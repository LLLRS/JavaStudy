package PackB;

import java.util.Scanner;

/*
 *1.ģ��һ��trim������ȥ���ַ������˵Ŀո� 
 *   ���أ��ַ���
 *
 *2.���ַ������з�ת Reverse the string
 *	�����ַ�������Ϊ�н�
 * 
 *3.��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
 *
 * 4.Java��ȡ�����ַ����������ͬ�Ӵ� 
	���̵��Ǹ��Ӵ����ճ��ȵݼ��ķ�ʽ��ȡ����
	��ÿ��ȡ�����Ӵ�ȥ�������ж��Ƿ����������������Ѿ��ҵ�����
 * */

public class StringTest {
	//4����һ
    public static String getMaxSubString(String s1,String s2)  
    {  
        String max = "",min = "";  
        max = (s1.length()>s2.length())?s1: s2;  
        min = (max==s1)?s2: s1;       
//      sop("max="+max+"...min="+min);  
        for(int x=0; x<min.length(); x++)  
        {  
            for(int y=0,z=min.length()-x; z!=min.length()+1; y++,z++)  
            {  
                String temp = min.substring(y,z);                 
                //sop(temp);  
                if(max.contains(temp))//if(s1.indexOf(temp)!=-1)  
                    return temp;  
            }  
        }  
        return "";  
    } 
    //4������
    private static String getSonString(String s1, String s2) {
        String max=null;
        String min=null;
        String temp="";

        max = (s1.length()>s2.length())?s1: s2;  
        min = (max==s1)?s2: s1;    
        
        for (int i = 0; i <min.length(); i++) {
            for (int j = 0; j <=i; j++) {
                String substring = min.substring(j, min.length()-i+j);//��С���ַ�����ʼ������������λ�Ƚ�
                if (max.contains(substring)) {
                    if(temp.length()<substring.length()) {
                        temp=substring;
                    }
                }
            }
            
        }
        
        return temp;
    }


	public static void method_count(String str,String goal) {
		int count = 0;
		int k = -2;
		
		for(int i = 0;i<= str.length()-1;i++) {
			k = str.indexOf(goal,k+2);
				if(k<0)  break;	
			count++;            			
		}
		//sop(k);
		System.out.println("�ַ���"+goal+"������"+count+"��");
		
	}
	public static String method_rever(String str) {
		char [] dst = new char[ str.length()];
		char [] temp = new char[ str.length()];
		
		str.getChars(0,str.length(),dst,0);
		for(int i = 0;i<= str.length()-1;i++)
			temp[i] = dst [str.length()-1-i];
		
		return String.valueOf(temp);
	}
	
	public static String method_trim(String str) {
		int st = 0;
		int end = str.length();

		for(int i = 0;(i<= str.length()-1)&&st<end;i++) {
			if(str.charAt(st) ==' ')  
				st++;
			
			if(str.charAt(end-1) ==' ')
				end--;					
		}
		if(st>end)
			return str;
		else
			return str.substring(st,end);
	}
	
	
	public static void main(String[] args) {
      
		 //String str = "        ";
		System.out.println("���������ַ�����");
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	 
		sop(method_trim(str));
		sop(method_rever(str));
	    method_count(str,"kk");
		sc.close();
		
        String s1 = "abccc";  
        String s2 = "cvhellobccnm";  
        //sop(getMaxSubString(s2,s1));  
        sop(getSonString(s1,s2));
	}
	
	public static void sop(Object obj) {
		
		System.out.println(obj);
	}

}
