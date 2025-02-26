package p1_student;

public class Student {
	// Fields, instance fields
	// package access or default access
	// public access: most generous access
	// private access: only local class (Student) can access. Most restrictive. 
	private String name; // name of the student object you are currently creating
	private double gpa;
	// It is the fields containing the data for the object!!!!
	
	
	// methods. notice the verb set
	void setName(String name) { //parameters are input for the fields
		this.name = name; // aName is not a field. It is a local variable used for holding the input
	}
	
	void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	// methods: getters
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
}
