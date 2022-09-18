package p1_operators;

public class Main {

	public static void main(String[] args) {
		int radius = 10;
		double length = 1;
		String name = "John Doe";
		double circleArea = radius * radius * Math.PI;
		double squareArea = length * length;
		System.out.println("Hey " + name + ": ");
		System.out.println("The area of the circle is: " + circleArea);
		System.out.println("The area of the square is: " + squareArea);
		System.out.println("The accurate PI value: " + Math.PI);
		
		System.out.println("The square root of 4 is: " + Math.sqrt(5));
		System.out.println(Math.pow(2, 3));
		
		int x1 = 3;
		int x2 = 2;
		System.out.printf("%-5.0f", x2 * 1.0/ x1);
	}

}
