package stringbuffer.demo;

/**
 * @author Administrator
 *
 */
 
		/*
		 * jdk1.5�Ժ�����˹��ܺ�StringBufferһģһ���Ķ��󡣾���StringBuilder
		 * 
		 * ��ͬ���ǣ�
		 * StringBuffer���߳�ͬ���ġ�ͨ�����ڶ��̡߳�
		 * StringBuilder���̲߳�ͬ���ġ�ͨ�����ڵ��̡߳� ���ĳ������Ч�ʡ�
		 * 
		 * jdk������
		 * 1������д��
		 * 2�����Ч�ʡ�
		 * 3�����Ӱ�ȫ�ԡ�
		 */
public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * StringBuffer:�ַ����Ļ�����
		 * ���ڴ洢���ݵ�����
		 * �ص㣺
		 * 	1.���ȿɱ�,�ù��캯����ʼ��ָ������
		 * 	2.���Դ洢��ͬ��������
		 * 	3.���ջ�ת�����ַ���ʹ��
		 * 	4.�����޸��ַ���
		 *  ���ܣ�
		 *   1.��ӣ�append
		 *   2.ɾ��
				public StringBuffer deleteCharAt(int index)
				public StringBuffer delete(int start, int end)����ͷ��������β
			 3.����
				char charAt(int index)
				int indexOf(String str)��
				int indexOf(String str,int fromIndex)
		 *	 4.�޸�
		 *		 StringBuffer replace(int start, int end,String str)
 		 *		 void setCharAt( )
     			
		 * */
           bufferMethodDemo();
	}
	public static void bufferMethodDemo() {
		//��������������
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append(true).append("hahah");
		//sb.append(true);
		sb.insert(1, "xixib");
		
		System.out.println(sb);
		
		
	}
}
