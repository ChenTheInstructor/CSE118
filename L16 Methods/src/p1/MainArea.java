package p1;

public class MainArea {

	public static void main(String[] args) {
//		System.out.println("The area is: " + calculateArea(3.0, 15));
		double area = calculateArea(3.0, 15);
		System.out.println(isPrime(11));
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void calculateArea2(double length, int width) {
		System.out.println(length * width);
	}

	public static double calculateArea(double radius) {
		return radius * radius * Math.PI;
	}
	
	public static double calculateArea(int radius) {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public static double calculateArea(double length, int width) {
		return length * width;
	}
	
	public static double calculateArea(int height, double base) {
		return base * height / 2;
	}
}
