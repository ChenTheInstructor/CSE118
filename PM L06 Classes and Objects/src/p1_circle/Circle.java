package p1_circle;

public class Circle {
	// fields, instance fields, properties, attributes
	private double radius;
	
	// methods
	// constructors
	public Circle() {
		
	}
	
	// overloaded constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// getters
	public double getArea() {
		return  Math.PI * radius * radius;
	}
	
	public double getCircumference() {
		return Math.PI * radius * 2;
	}
	
	public double getRadius() {
		return radius;
	}
	
	// setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//toString method
	public String toString() {
		return "Radius =\t " + radius;
	}
}
