package collection.demo;

//定义了一个Person类

public class Person implements Comparable<Person>
{
	
	
	
	private String name;
	
	public Person() {
		super();
	}
	private int age;
	
	Person(String name) {
		this.name = name;
	}
	public Person(String name,int age) {
		this(name);
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
	
	public void show() {
		
		System.out.println("name: "+this.name+"  "+""
				+"age: "+this.age);
	}
	@Override
	public int hashCode() {
		
		return name.hashCode()+age ;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		Person p = (Person)obj;

		return this.name.equals(p.name) && this.age == p.age;
	}
	@Override
	public int compareTo(Person p) {

		int temp = this.age - p.age;

		
		return temp ==0 ? this.name.compareTo(p.name):temp;
	
	}
	@Override
	public String toString() {
		return  name + " " + age;
	}

	
}