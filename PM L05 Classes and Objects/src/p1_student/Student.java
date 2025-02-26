package p1_student;

public class Student {
	// fields: nouns
	private String name;
	private double gpa;
	
	// methods: verbs
	public void curveGpa(double curveAmount) {
		gpa = gpa + curveAmount;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setGpa(double newGpa) {
		gpa = newGpa;
	}

}
