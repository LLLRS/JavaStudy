package io.test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;



/*注意：一定要设置文件路径
 * 
 * 获取指定目录下，指定扩展名的文件(包含子目录中的)
 * 这些文件的绝对路径写入到一个文本文件中。
 * 
 * 简单说，就是建立一个指定扩展名的文件的列表。 
 * 
 * 思路：
 * 1，必须进行深度遍历。
 * 2，要在遍历的过程中进行过滤。将符合条件的内容都存储到容器中。
 * 3，对容器中的内容进行遍历并将绝对路径写入到文件中。 
 * 
 *
 */
public class CopyAllFlie {

	private static final String PATH = "E:/byrbt/test/视频源码";
//	private static final String SOURCEDIR_PATH = "E:/byrbt/test/";  
	private static final String DESTDIR_PATH = "E:/byrbt/test";  
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
			
		File dir = new File(PATH);
		
		FilenameFilter filter = new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".rar");
			}			
		};
		
		List<File> list = new ArrayList<File>();
		
		getFiles(dir,filter,list);
		
//		File destFile = new File(dir,"javalist.txt");
		
//		writePathFile(list,destFile);
		
		moveFile(list);
//		unRarFile(list);
	}
	
	
	public static void moveFile(List<File> list)throws IOException{
			
			BufferedWriter bufw = null;
			BufferedReader bufr = null;

			
			for(File file : list){
				
				bufr = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
				bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(PATH+"/22222/"+file.getName())));
				
				String line = null;
				
				while((line=bufr.readLine())!=null){
					bufw.write(line);
					bufw.newLine();
					bufw.flush();
				}
				
				bufw.close();
				bufr.close();
			}
				
	}
	/**
	 * 对指定目录中的内容进行深度遍历，并按照指定过滤器，进行过滤，
	 * 将过滤后的内容存储到指定容器List中。
	 * @param dir
	 * @param filter
	 * @param list
	 */
	public static void getFiles(File dir,FilenameFilter filter,List<File> list){
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			if(file.isDirectory()){
				//递归啦！
				getFiles(file,filter,list);
			}else{
				//对遍历到的文件进行过滤器的过滤。将符合条件File对象，存储到List集合中。 
				if(filter.accept(dir, file.getName())){
					list.add(file);
				}
			}
		}
		
	}
	
	public static void writePathFile(List<File> list,File destFile)throws IOException{
		
		BufferedWriter bufw = null;
		try {
			bufw = new BufferedWriter(new FileWriter(destFile));
			for(File file : list){
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
			
			
		} /*catch(IOException e){
			
			throw new RuntimeException("写入失败");
		}*/finally{
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					
					throw new RuntimeException("关闭失败");
				}
		}
}



//public static void unRarFile(List<File> list)throws Exception{
//		
//	for(File file : list){
//		
//		 ZipRarUtil.deCompress(file.getAbsolutePath(), DESTDIR_PATH);
//		}
//	
//	}

}


