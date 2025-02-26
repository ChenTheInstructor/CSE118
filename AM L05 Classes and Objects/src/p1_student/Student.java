package p1_student;

public class Student {
	// fields for data in blue
	private String name;
	private double gpa;
	
	// A special method: constructor:used for creating objects
	public Student() {
		name = "Jack";
		gpa = 4.0;
	}
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	// methods with parameter(s)
	// curverGpa method
	public void curveGpa(double curveAmount) {
		gpa = gpa + curveAmount;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
}
