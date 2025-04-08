package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//	p1	int score = getScore();
//		passOrFail(score);
		
//	p2	int age = getAge();
//		categorize(age);
		
//	p3	char grade = getLetterGrade();
//		translate(grade);
		
//	p4	String username = getLoginInfo("username");
//		String password = getLoginInfo("password");
//		login(username, password);
//		
//		String a = "A";
//		String b = new String("1");
//		System.out.println(a.compareTo(b));
		
//	p5	int number = getNumber();
//		checkCondition(number);
		
//	p6	String color = getColor().toLowerCase();
//		printComment(color);
		
		int a = getSide("a");
		int b = getSide("b");
		int c = getSide("c");
		checkType(a, b, c);
		
	}
	
	private static void checkType(int a, int b, int c) {
		if(!isValidTriangle(a, b, c)) {
			System.out.println("Invalid triangle");
		} else if(a == b && a == c && b == c) {
			System.out.println("Equilateral");
		} else if(a == b || b == c || a == c){
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
}

	private static boolean isValidTriangle(int a, int b, int c) {
		return !(a + b <= c || a + c <= b || b + c <= a);
	}
	
	private static int getSide(String flag) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side " + flag + ": ");
		return scanner.nextInt();
	}
	
	private static void printComment(String color) {
		String message = switch(color) {
		case "red" -> "Stop";
		case "green" -> "Go";
		case "yellow" -> "Caution";
		default -> "Invalid color";
		};
		System.out.println(message);
	}

	private static String getColor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the color: ");
		return scanner.nextLine();
	}

	
	private static void checkCondition(int number) {
		if(number % 2 == 0 && number >= 10 && number <= 100) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	private static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number: ");
		return scanner.nextInt();
	}

	private static void login(String username, String password) {
		if(username.equalsIgnoreCase("admin") && password.equals("1234")) {
			System.out.println("login successful.");
		} else {
			System.out.println("Invalid login.");
		}
	}

	private static String getLoginInfo(String flag) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your " + flag + ": ");
		return scanner.nextLine();
	}

	private static void translate(char grade) {
		String comment;
		switch(grade) {
		case 'A':
			comment = "Excellent";
			break;
		case 'B':
			comment = "Good";
			break;
		case 'C':
			comment = "Average";
			break;
		case 'D':
			comment = "Needs improvement";
			break;
		case 'F':
			comment = "Failing";
			break;
		default:
			comment = "Invalid grade";
		}
		System.out.println(comment);
	}

	private static char getLetterGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your letter grade: ");
		return scanner.nextLine().toUpperCase().charAt(0);
	}

	private static void categorize(int age) {
		String c;
		if(age < 13) {
			c = "Child";
		} else if(age <= 17) {
			c = "Teen";
		} else if (age <= 64) {
			c = "Adult";
		} else {
			c = "Senior";
		}
		System.out.println(c);
	}

	private static int getAge() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		return scanner.nextInt();
	}
	

	private static void passOrFail(int score) {
		if(score >= 60) {
			System.out.println("You passed.");
		} else {
			System.out.println("You failed.");
		}
	}

	private static int getScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your test score: ");
		return scanner.nextInt();
	}
	
	

}
