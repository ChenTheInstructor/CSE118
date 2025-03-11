package p2_coding_questions;

public class Dog {
	// fields (instance variables, instance fields)
	// Used to store different values for different objects
	private String name;
	private double weight;
	
	private static /*final*/ String breed = "Golden";// value is hard coded into the class
	
	// constructor methods: used to initialize the fields
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
//		breed = "Golden";
	}
	
	public Dog() {
		this.name = "Max";
		this.weight = 10.0;
	}
	
	public Dog(double weight, String name) {
		this.name = name;
		this.weight = weight;
	}
	
	public void feed(int foodAmount) {
		weight = weight + (double)foodAmount / 10;
	}
	
	// setters: allowing me to set new values to the fields
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// toString method
	public String toString() {
		return "[" + name + ", " + weight + "]";
	}
	
	// getBreed
	public static String getBreed() {
		return breed;
	}
	
	// setBreed
	public static void setBreed(String breed) {
		Dog.breed = breed;
	}
}
