package io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {

		FileWriter fw = null;
		//外面声明对象，里面处理
		try {

			fw = new FileWriter("k:/src/com/io/demo.txt",true);

			fw.write("abcde" + LINE_SEPARATOR + "hahaha");

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (fw != null) //重要
				try {
					fw.close();
				} catch (IOException e) {
					// code....
					throw new RuntimeException("关闭失败");
				}
		}

	}

}
