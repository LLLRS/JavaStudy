package Demo;//包名。类名

import PackA.PackageADemo; //导入类
/*
 * import 简化 类名的书写
 * 通配符 .* 倒入所有的类.class文件
 * 出现重名必须加包名  
 * */

public class PackageDemo {
	public static void main(String[] args) {	
		
		PackageADemo t = new PackageADemo();
		t.show();
	     
		//PackB.PackageBDemo d = new PackB.PackageBDemo();
		//d.method();
 	     		
	}
}



  