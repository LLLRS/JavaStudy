package collection.demo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Administrator
 *
 */
public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("abc1");
		v.add("abc2");
		v.add("abc3");
		
		//��ʾVector�е�elements()����
		Enumeration<String> e = v.elements() ;
		   for (; e.hasMoreElements() ;) 
		         System.out.println(e.nextElement());
		     

	}

}
