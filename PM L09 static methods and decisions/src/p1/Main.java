package p1;

public class Main {

	public static void main(String[] args) {
//		System.out.println(getLetterGrade(95));
//		System.out.println(getLetterGrade(85));
//		System.out.println(getLetterGrade(100));
//		System.out.println(getLetterGrade(70));
//		System.out.println(getLetterGrade(65));
//		System.out.println(getLetterGrade(55));
//		System.out.println(isLeapYear(2024));
//		System.out.println(isLeapYear(2100));
		
//		double n1 = 10;  // widering
//		int n2 = (int)10.5;// narrowering
//		String str1 = String.valueOf(false);
//		String str2 = "111";
//		int n3 = Integer.parseInt(str2);
//		double n4 = Double.parseDouble("2.5");
//		System.out.println(isThreeDigitPalindrome(512));
		describeNumber(-9);
	}
	
	public static void describeNumber(int n) {
		String answer = (n < 0)? "Negative":(n == 0)? "Zero" : (n % 2 == 0)? "Positive Even":"Positive Odd";
		System.out.println(answer);
//		if(n < 0) {
//			System.out.println("Negative.");
//		} else if(n == 0) {
//			System.out.println("Zero.");
//		} else {
//			if(n % 2 == 0) {
//				System.out.println("Positive Even.");
//			} else {
//				System.out.println("Positive Odd");
//			}
//		}
	}
	
	public static boolean isThreeDigitPalindrome(int number) {
		return (number / 100) == (number % 10);
	}
	
	public static boolean isVowel(char ch) {
		String myCharStr = String.valueOf(ch);
		char u = Character.toUpperCase(ch);
		return (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U');
			
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
	}
	
	public static char getLetterGrade(int score) {
		return (score >= 90)? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F'; 
//		char grade;
//		if(score >= 90) {
//			grade = 'A';
//		} else if(score >= 80) {
//			grade = 'B';
//		} else if(score >= 70) {
//			grade = 'C';
//		} else if(score >= 60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
//		return grade;
	}

	public static int minOfThree(int a, int b, int c) {
//		return Math.min(Math.min(a, b), c);
//		if (a < b && a < c) {
//			return a;
//		}
//
//		if (b < a && b < c) {
//			return b;
//		}
//		return c;

		return (a < b && a < c) ? a : (b < a & b < c) ? b : c;

	}

	public static boolean inRange(int number) {
//		if(number >= 10) {
//			if(number <= 100) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		} 

		return (number >= 10 && number <= 100);

	}

	public static boolean isEven(int number) {
//		return (number % 5 == 0);
		return (number % 2 == 0) ? true : false;
	}

	public static int max(int a, int b) {
//		if(a > b) {
//			return a;
//		}
//		return b;

//		return (a > b)? a : b; // ternary operation
		return Math.max(a, b);
	}

	public static boolean canVote(int age) {
		return age >= 18;
	}

	public static void printSign(int number) {
//		if(number > 0) {
//			System.out.println("Positive");
//		} else if (number == 0) {
//			System.out.println("Zero");
//		} else {
//			System.out.println("Negative");
//		}
		System.out.println((number > 0) ? "Positive" : (number == 0) ? "Zero" : "Negative");
	}

}
