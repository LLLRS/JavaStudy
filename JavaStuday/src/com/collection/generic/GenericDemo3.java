package collection.generic;

public class GenericDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Tool<String> tool = new Tool<String>();
		
		tool.show(new Integer(4));
		tool.show("abc");
		tool.print("hahah");
//		tool.print(new Integer(8));
		Tool.method("haha");
		Tool.method(new Integer(9));
	}
	

}
