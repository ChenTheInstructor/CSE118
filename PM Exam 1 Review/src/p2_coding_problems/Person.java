package p2_coding_problems;

public class Person {
	private String name = "Alice";
	private int age = 25;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age );
	}
	
	public String toString() {
		return "Person[name=" + name + ", age=" + age +"]";
	}
}


