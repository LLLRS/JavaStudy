package io.test;

import java.io.File;



/*注意：一定要设置文件路径
 * 
 * 重命名文件夹的名字
 *
 */
public class Rename {

	private static final String PATH = "F:\\byrbt\\黑马12期javeee+云计算+大数据";

	
	public static void main(String[] args) throws Exception {
			
		File dir = new File(PATH);
//		System.out.println(dir.isDirectory());
		File[] files = dir.listFiles();
		
//		System.out.println(files.length);
		String tem = null;
		for(File temp : files){
			tem = temp.getName();
			if(tem.endsWith("更多视频资料关注微信公众号【菜鸟要飞】")){
			String[] t = tem.split("更多视频资料关注微信公众号【菜鸟要飞】");
			System.out.println(temp.renameTo(new File(PATH+"\\"+t[0])));

			}
//			System.out.println(temp.getName());
		}
			
	}
		
}


