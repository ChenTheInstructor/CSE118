package p3_circle;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}
}
