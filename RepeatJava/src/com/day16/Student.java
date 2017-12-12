package com.day16;

public class Student {
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
	

	
}
