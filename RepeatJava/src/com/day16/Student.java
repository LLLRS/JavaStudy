package com.day16;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student() {
	
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override	
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		boolean temp = this.getName().equals(s.getName());
		return temp?this.getAge()==s.getAge():temp;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		//年龄长度 --> 姓名 --> 年龄
		int temp1 = this.getName().length()-o.getName().length();
		int temp2 = (temp1==0?this.getName().compareTo(o.getName()):temp1);
		
		return temp2==0?this.getAge()-o.getAge():temp2;
	}
	

	
}
