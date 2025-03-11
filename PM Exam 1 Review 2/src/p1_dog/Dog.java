package p1_dog;

public class Dog {
	private String name;
	private double weight;

	private static String breed = "Golden";

	public Dog() { // no-arg constructor
		name = "MAX1";
		weight = 5;
	}

	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static String getBreed() {
		return breed;
	}

	public static void setBreed(String breed) {
		Dog.breed = breed;
	}
	
	public String toString() {
		return name + ": " + weight + ", " + breed;
	}
}
