package cn.ad;

import java.util.TreeSet;
import java.util.Vector;

/*====�ھ���==================================
��дһ��������ȥ��Vector�����е��ظ�Ԫ�ء�
*/

public class removeVector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		v.add("abc");
		v.add("abc1");
		v.add("abc2");
		v.add("abc1");
		v.add("abc3");
		v.add("abc2");
		//ȥ��ǰ
		System.out.print("ȥ��ǰ: ");
		for(String s:v)
			System.out.print(s+"  ");
		//ȥ��Vretor�ж���Ԫ��
		v = removeAdd(v);
		System.out.println();
//		ȥ����
		System.out.print("ȥ����: ");
		for(String s:v)
			System.out.print(s+"  ");
	}

	public static Vector<String> removeAdd(Vector<String> v) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		for(String s:v)
			ts.add(s);
		
		v.clear();
		
		for(String s:ts)
			v.add(s);
		
		return v;
	}

}
