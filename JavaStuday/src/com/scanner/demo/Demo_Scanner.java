package scanner.demo;

import java.util.Scanner;

public class Demo_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //¼��һ������

		if(sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println("i = "+ i);  	
		}
		else
			System.out.println("�������ʹ���");
	}
}
