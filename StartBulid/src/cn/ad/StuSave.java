package cn.ad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*====第四题====================================
有五个学生，每个学生有3门课的成绩，定义一种比较直观的文本文件格式，
输入学生姓名和成绩，输入的格式：name,30,30,30从键盘输入以上数据（包括姓名，三门课成绩），
按总分数从高到低的顺序将学生信息存放在磁盘文件"stu.txt"中。
*/
public class StuSave {
	
	public static ArrayList<String> sb = null;
	
	public static void main(String[] args) throws IOException {
		File fd = new File("stu.txt");
		if(!fd.exists())
			fd.createNewFile();
		sb = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fd));
		
		String line = null;
		while((line = br.readLine())!=null) {
			if("over".equals(line))
				break;
			sb.add(line);
		
		}
		
		arrays(sb);
		for (String s:sb) {	
			bw.write(s);
			bw.newLine();
			bw.flush();
			
		}
		br.close();
		bw.close();

	}

	public static void  arrays(ArrayList<String> sb) {
		
		String[] temp = new String[sb.size()];
//		String[] name = new String[sb.size()];
		int[] score = new int[sb.size()];
		
		String[] st = new String[4];
		for(int i=0;i<sb.size();i++) {
			temp[i] = sb.get(i);
			st = temp[i].split(",");
//			name[i] = st[0];
			score[i] = Integer.parseInt(st[1])+ Integer.parseInt(st[2])+Integer.parseInt(st[3]);
//			for(String s:st)
//				System.out.println(s);
//			System.out.println(temp[i]);
		}
		//选择排序
		for(int x= 0;x<sb.size()-1;x++) {
			for(int y=x+1;y<sb.size();y++) {
				if(score[x]<score[y]) {
//					swap(name,x,y);
//					swap(score,x,y);
					swap(temp,x,y);
				}
			}		
		}
		sb.clear();
		for (String s:temp)
			sb.add(s);
//		for(int x= 0;x<sb.size();x++) {
//			System.out.println(name[x]);
//			System.out.println(score[x]);
//			System.out.println(temp[x]);
//		}
	
	}
    //用于给数组进行元素的位置置换。
    public static void swap(int[] arr, int a,int b){
          int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
    
    public static void swap(String[] arr, int a,int b){
       String temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
  }
}
