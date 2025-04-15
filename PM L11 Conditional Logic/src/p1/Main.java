package p1;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//p7		int a = getSide('1');
//		int b = getSide('2');
//		int c = getSide('3');
//		evaluateTriangle(a, b, c);

//	p8	char ch = getCharacter();
//		evaluateCharacter(ch);

// p9		String str1 = getString();
//		String str2 = getString();
//		compareThem(str1, str2);

//	p10	int dayOfMonth = getDayOfMonth();
//		printDaysforMonth(dayOfMonth);
		
//	p11	int temp = getTemperature();
//		String feel = evaluateFeelings(temp);
//		System.out.println(feel);
		
	
//	p12	 int number = getNumber(); e
//		 evaluate(number);
//		int n1 = getNumber("1");
//		int n2 = getNumber("2");
//		System.out.println(getAbsoluteDifference(n1, n2));
//		String letter = "fdsafsa fdagfda fgdag party gfda ojaj;ajo;f sa hello hi bye";
//		System.out.println(letter.indexOf("party"));
//		System.out.println(letter.endsWith("."));
		String s = "abc";
		String s_reversed = ""  + s.charAt(2) + s.charAt(1) + s.charAt(0);
		
		System.out.println(s_reversed);
	}

	private static int getAbsoluteDifference(int n1, int n2) {
		return Math.abs(n1 - n2);
	}

	private static int getNumber(String flag) {
		System.out.print("Enter number " + flag + ": " );
		return scanner.nextInt();
	}

	private static void evaluate(int n) {
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("Multiple of both 3 and 5.");
		} else if(n % 3 == 0) {
			System.out.println("Multiple of 3.");
		} else if (n % 5 == 0) {
			System.out.println("Multiple of 5.");
		} else {
			System.out.println("Neither.");
		}
	}

	private static int getNumber() {
		System.out.println("Enter a whole number: ");
		return scanner.nextInt();
	}

	private static String evaluateFeelings(int t) {
		String feeling;
		if(t < 32) {
			feeling = "Freezing";
		} else if(t <= 50) {
			feeling = "Cold";
		} else if (t <= 85) {
			feeling = "Warm";
		} else {
			feeling = "Hot";
		}
		return feeling;
	}

	private static int getTemperature() {
		System.out.println("Enter the temperature: ");
		return scanner.nextInt();
	}

	private static void printDaysforMonth(int n) {
		System.out.println(switch (n) {
		case 1, 3, 5, 7, 8, 10, 12 -> "31";
		case 4, 6, 9, 11 -> "30";
		case 2 -> "28";
		default -> "No such day for a month";
		});
//		switch (n) {
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.println("31");
//			break;
//		case 4, 6, 9, 11:
//			System.out.println("30");
//			break;
//		case 2:
//			System.out.println("28");
//			break;
//		default:
//			System.out.println("No such number for a month.");
//		}
	}

	private static int getDayOfMonth() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("The number representing the month: ");
		return scanner.nextInt();
	}

	private static void compareThem(String a, String b) {
		if (a.compareTo(b) == 0) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
//		if(a.equals(b)) {
//			System.out.println("Equal");
//		} else {
//			System.out.println("Not equal");
//		}
	}

	private static String getString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		return scanner.nextLine();
	}

	private static void evaluateCharacter(char ch) { // 65>= ch <= 90
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
			System.out.println("It is a letter.");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("It is a digit.");
		} else {
			System.out.println("It is a symbol.");
		}
//		if(Character.isDigit(ch)) {
//			System.out.println("It is a digit.");
//		} else if(Character.isAlphabetic(ch)) {
//			System.out.println("It's a letter");
//		} else {
//			System.out.println("It's a symbol");
//		}
	}

	private static char getCharacter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		return scanner.nextLine().charAt(0);
//		char ch = str.charAt(0);
//		return ch;
	}

	private static void evaluateTriangle(int a, int b, int c) {
		if (isNotValidTriangle(a, b, c)) {
			System.out.println("This is not a valid triangle.");
		} else {
			if (a != b && a != c && b != c) {
				System.out.println("Scalene");
			} else if (a == b && a == c && b == c) {
				System.out.println("Equilaterial");
			} else {
				System.out.println("Isosceles");
			}
		}
	}

	private static int getSide(char flag) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of side " + flag + ": ");
		return scanner.nextInt();
	}

	private static boolean isNotValidTriangle(int a, int b, int c) {
		return a + b <= c || a + c <= b || b + c <= a;
//		if (a + b <= c || a + c <= b || b + c <= a) {
//			return true;
//		}
//			return false;

	}

}
