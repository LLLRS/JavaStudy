package tool.arrays.demo;

public class ParamterDemo {

	public static void main(String[] args) {

//		int sum = add(4,5);
//		System.out.println("sum="+sum);
//		int sum1 = add(4,5,6);
//		System.out.println("sum1="+sum1);
		
		
//		int[] arr = {5,1,4,7,3};
//		int sum = add(arr);
//		System.out.println("sum="+sum);
//		int[] arr1 = {5,1,4,7,3,9,8,7,6};
//		int sum1 = add(arr1);
//		System.out.println("sum1="+sum1);
		
		int sum = newAdd(5,1,4,7,3);
		System.out.println("sum="+sum);
		int sum1 = newAdd(5,1,2,7,3,9,8,7,6);
		System.out.println("sum1="+sum1);
		
	}
	/*
	 * �����Ŀɱ����:
	 * ��ʵ����һ������,���ǽ��յ��������Ԫ��
	 * �Զ�����ЩԪ�ط�װ������,���˵����ߵ���д
	 * 
	 * ע�⣺�ɱ�������ͣ����붨���ڲ����б�Ľ�β
	 * ...����ʡ��
	 */
	public static int newAdd(int...  arr){
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	
	public static int add(int[] arr){
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	
	
	
	public static int add(int a,int b){
		return a+b;
	}
	
	public static int add(int a,int b,int c){
		return a+b+c;
	}

}
