package cn.compresss;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import de.innosystec.unrar.Archive;
import de.innosystec.unrar.exception.RarException;
import de.innosystec.unrar.exception.RarException.RarExceptionType;
import de.innosystec.unrar.rarfile.FileHeader;



public class CompressBook {
	 public CompressBook() {}

	   /*
	    * ѹ���ļ���
	    * inputFileName ����һ���ļ���
	    * zipFileName ���һ��ѹ���ļ���
	    */
	    public static void zip(String inputFileName) throws Exception {
	        String zipFileName = "G:\\hahang\\123.zip"; //������ļ�����
	        System.out.println(zipFileName);
	        zip(zipFileName, new File(inputFileName));
	    }

	    private static void zip(String zipFileName, File inputFile) throws Exception {
	        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
	        zip(out, inputFile, "");
	        System.out.println("zip done");
	        out.close();
	    }

	    private static void zip(ZipOutputStream out, File f, String base) throws Exception {
	        if (f.isDirectory()) {
	           File[] fl = f.listFiles();
	           out.putNextEntry(new org.apache.tools.zip.ZipEntry(base + "/"));
	           base = base.length() == 0 ? "" : base + "/";
	           for (int i = 0; i < fl.length; i++) {
	           zip(out, fl[i], base + fl[i].getName());
	         }
	        }else {
	           out.putNextEntry(new org.apache.tools.zip.ZipEntry(base));
	           FileInputStream in = new FileInputStream(f);
	           int b;
	           System.out.println(base);
	           while ( (b = in.read()) != -1) {
	            out.write(b);
	         }
	         in.close();
	       }
	    }

	   
	    /**
	     * ѹ���ļ�
	     * @param string
	     * @throws IOException
	     */
		private static void CompressTest(String string) throws IOException {
			// TODO Auto-generated method stub
			 File f = new File("a.jpg");
	         FileInputStream fis = new FileInputStream(f);
	         BufferedInputStream bis = new BufferedInputStream(fis);
	         byte[] buf = new byte[1024];
	         int len;
	         FileOutputStream fos = new FileOutputStream(f.getName()+".zip");
	         BufferedOutputStream bos = new BufferedOutputStream(fos);
	         ZipOutputStream zos = new ZipOutputStream(bos);//ѹ����
	         ZipEntry ze = new ZipEntry(f.getName());//����ѹ����������ļ���
	         zos.putNextEntry(ze);//д���µ� ZIP �ļ���Ŀ��������λ����Ŀ���ݵĿ�ʼ��

	         while((len=bis.read(buf))!=-1)
	         {
	            zos.write(buf,0,len);
	            zos.flush();
	         }
	         bis.close();
	         zos.close(); 
		}
		
   
		 public static void main(String [] temp){
		        CompressBook book = new CompressBook();
		        try {
		          zip("G:\\hahang\\�ӿ��ĵ�\\ɸ����\\20181115");//��Ҫѹ�����ļ���
		        }catch (Exception ex) {
		           ex.printStackTrace();
		       }
		    }
}