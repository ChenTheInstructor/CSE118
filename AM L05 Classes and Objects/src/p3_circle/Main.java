package p3_circle;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle();
//		System.out.println("Area: " + c1.getArea() + "; Circumference: " + c1.getCircumference());
//		System.out.println("------------------------");
		Circle c2 = new Circle(2.0);
//		System.out.println("Area: " + c2.getArea() + "; Circumference: " + c2.getCircumference());
		
		System.out.printf("%20S%20S%n", "AREA", "Circumference");
		System.out.printf("%20.2f%20.2f%n", c1.getArea(), c1.getCircumference());
		System.out.printf("%20.2f%20.2f%n", c2.getArea(), c2.getCircumference());
	}

}
