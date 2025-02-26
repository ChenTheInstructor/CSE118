package p1_circle;

public class Demo {

	public static void main(String[] args) {
		Circle c1 = new Circle(); // no-arg constructor
		c1.setRadius(5.5);
		double area = c1.getArea();
		double circ = c1.getCircumference();
		double radius = c1.getRadius();
		// print results in a table
		System.out.printf("%10S%10S%10S%n", "radius", "area", "circ.");
		System.out.println("--------------------------------------------------");
		System.out.printf("%10.2f%10.2f%10.2f%n", radius, area, circ);
		
		Circle c2 = new Circle(1.5);
		System.out.printf("%10.2f%10.2f%10.2f%n", c2.getRadius(), c2.getArea(), c2.getCircumference());
		
		System.out.println("\n\n");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
