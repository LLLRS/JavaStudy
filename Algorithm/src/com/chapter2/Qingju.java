package com.chapter2;

//����nλ�����ַ���

public class Qingju {
	public static final int WEI = 4; //λ��
	public static final int K = 8; //����(С��10)
	public static int [] A = new int[WEI];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Binary(WEI);
		KString(WEI,K);
	}
	private static void Binary(int t) {
		// TODO Auto-generated method stub
		if (t<1){
			for(int s: A){
				System.out.print(s);
			}
			System.out.println();
		}
		else{
			
			A[t-1] = 0;
			Binary(t-1);
			A[t-1] = 1;
			Binary(t-1);
		}
	}
	
	private static void KString(int t,int k) {
		// TODO Auto-generated method stub
		if (t<1){
			for(int s: A){
				System.out.print(s);
			}
			System.out.println();
		}
		else{
			for(int i=0;i<k;i++){
				A[t-1] = i;
				KString(t-1,k);
			}
		}
	}

}
