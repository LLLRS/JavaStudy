package com.day14;

//ʵ���ļ����ļ��еĸ��Ƶ�ָ��Ŀ¼
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream; 
  
public class moveDir {  
    
    public static void main(String[] args) throws Exception{  
        //��Ҫ���Ƶ�Ŀ���ļ���Ŀ���ļ���  
        String pathname = "F:\\byrbt\\2015��Java������Ƶ_����ǳ��������\\day02";  
        File file = new File(pathname);  
        //���Ƶ���λ��  
        String topathname = "D:\\zz";  
        File toFile = new File(topathname);  
   
        copyDir(file, toFile);  
        
         
    }  


    
    public static void copyDir(File file, File toFile) throws Exception {  
        byte[] b = new byte[1024];  
        int a;  
        FileInputStream fis;  
        FileOutputStream fos;  
        if (file.isDirectory()) {  
            String filepath = file.getAbsolutePath();  
            filepath=filepath.replaceAll("\\\\", "/");  
            String toFilepath = toFile.getAbsolutePath();  
            toFilepath=toFilepath.replaceAll("\\\\", "/");  
            int lastIndexOf = filepath.lastIndexOf("/");  
            toFilepath = toFilepath + filepath.substring(lastIndexOf ,filepath.length());  
            File copy=new File(toFilepath);  
            //�����ļ���  
            if (!copy.exists()) {  
                copy.mkdir();  
            }  
            //�����ļ���  
            for (File f : file.listFiles()) {  
                copyDir(f, copy);  
            }  
        } else {  
            if (toFile.isDirectory()) {  
                String filepath = file.getAbsolutePath();  
                filepath=filepath.replaceAll("\\\\", "/");  
                String toFilepath = toFile.getAbsolutePath();  
                toFilepath=toFilepath.replaceAll("\\\\", "/");  
                int lastIndexOf = filepath.lastIndexOf("/");  
                toFilepath = toFilepath + filepath.substring(lastIndexOf ,filepath.length());  
                  
                //д�ļ�  
                File newFile = new File(toFilepath);  
                fis = new FileInputStream(file);  
                fos = new FileOutputStream(newFile);  
                while ((a = fis.read(b)) != -1) {  
                    fos.write(b, 0, a);  
                }  
            } else {  
                //д�ļ�  
                fis = new FileInputStream(file);  
                fos = new FileOutputStream(toFile);  
                while ((a = fis.read(b)) != -1) {  
                    fos.write(b, 0, a);  
                }  
            }  
  
        }  
    }  
  
}  