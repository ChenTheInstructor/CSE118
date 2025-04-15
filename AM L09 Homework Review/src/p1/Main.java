package p1;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

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
		
//	p7	int a = getSide("a");
//		int b = getSide("b");
//		int c = getSide("c");
//		checkType(a, b, c);
		
//	p8	char ch = getCharacter();
//		determineType(ch);
	
//	p9	String s1 = getString();
//		String s2 = getString();
//		EvaluateEquality(s1, s2);
		
//	p10	int monthNumber = getMonthNumber();
//		showDaysForTheMonth(monthNumber);
		
//	p12	int n = getNumber();
//		evaluateNumber(n);
		
		int n1 = getNumber();
		int n2 = getNumber();
		getAbsoluteDifference(n1, n2);
	}
	
	
	
	private static void getAbsoluteDifference(int n1, int n2) {
		System.out.println(Math.abs(n1 - n2));
	}



	private static void evaluateNumber(int n) {
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("Multiple of 3 and 5.");
		} else if(n % 3 == 0) {
			System.out.println("Multiple of 3.");
		} else if (n % 5 == 0) {
			System.out.println("Multiple of 5.");
		} else {
			System.out.println("Neither");
		}
	}



	private static void showDaysForTheMonth(int n) {
		String str = switch(n) {
		case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
		case 4, 6, 9, 11 -> "30 days";
		case 2 -> "28 days";
		default -> "no such number for a month";
		};
		System.out.println(str);
		
//		String days = (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)? "31 days" 
//				: (n == 2) ? "28 days" 
//				: (n == 4 || n == 6 || n == 9 || n == 11)? "30 days" 
//				: "No such day for a month";
//		System.out.println(days);
//		if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
//			System.out.println("31 days.");
//		} else if (n == 2) {
//			System.out.println("28 days.");
//		} else if(n == 4 || n == 6 || n == 9 || n == 11) {
//			System.out.println("30 days.");
//		} else {
//			System.out.println("No such day for a month.");
//		}
	}

	private static int getMonthNumber() {
		System.out.print("Enter the number for the month: ");
		return scanner.nextInt();
	}

	private static void EvaluateEquality(String s1, String s2) {
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal.");
		} else {
			System.out.println("Not equal.");
		}
	}

	private static String getString() {
		System.out.print("Enter a string: ");
		return scanner.nextLine();
	}

	private static void determineType(char ch) {
		if(ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
			System.out.println("Letter.");
		} 
		
		else if (ch >= 48 && ch <= 57) {
			System.out.println("Digit.");
		} else {
			System.out.println("Symbol.");
		}
//		if(Character.isDigit(ch)) {
//			System.out.println("It's a digit.");
//		} else if(Character.isAlphabetic(ch)) {
//			System.out.println("It's a letter.");
//		} else {
//			System.out.println("It's a symbol.");
//		}
	}

	private static char getCharacter() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		return scanner.nextLine().charAt(0);
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
