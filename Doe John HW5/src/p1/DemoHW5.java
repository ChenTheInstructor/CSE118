package p1;

public class DemoHW5 {
	// Single-Responsibility Principle
	// problem 1
	public static void greet(String name) {
		System.out.println("Hello, " + name);
	}

	// Problem 2
	public static int max(int a, int b) {
//		return (a > b) ? a : b;
		if (a > b) {
			return a;
		}
		return b;
	}
	
	// Problem 3
	public static boolean isEven(int num) {
		return num % 2 == 0;
		
//		return (num % 2 == 0) ? true : false;
//		if(num % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	// Problem 4
	public static int absoluteValue(int num) {
		return (num < 0) ? -num : num;
//		if(num < 0) {
//			return -num;
//		}
//		return num;
	}
	
	// Problem 5
	public static double calculateSimpleInterest(double principal, double rate, int time) {
		return (principal * rate * time) / 100;
	}
	
	// Problem 6
	public static String checkNumber(int num) {
		return (num < 0) ? "Negative" : ((num == 0) ? "Zero" : "Positive");
//		if(num < 0) {
//			return "Negative";
//		} else if(num == 0) {
//			return "Zero";
//		} else {
//			return "Positive";
//		}
	}
	
	// Problem 7
	public static double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
	
	// Problem 8
	public static double celciusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	
	// Problem 9
	public static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' ||  c == 'i' || c == 'o' || c == 'u');
//		if(c == 'a' || c == 'e' ||  c == 'i' || c == 'o' || c == 'u') {
//			return true;
//		}
//		return false;
	}
	
	// Problem 10
	public static int minOfThree(int a, int b, int c) {
		return minOfTwo(minOfTwo(a, b), c);
//		if(a < b && a < c) {
//			return a;
//		} else if (b < a && b < c) {
//			return b;
//		} else {
//			return c;
//		}
	}
	
	public static int minOfTwo(int x, int y) {
		return (x < y) ? x : y;
	}

	public static void main(String[] args) {
		greet("John");
		System.out.println(absoluteValue(10));
	}

}
