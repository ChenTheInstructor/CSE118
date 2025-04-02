package p1;

public class Main {

	public static void main(String[] args) {
		System.out.println(isEven(4));
		System.out.println(max(14, 7));
		System.out.println(canVote(17));
		printSign(0);
		System.out.println(inRange(190));
		System.out.println(minOfThree(5, 10, 0));
		System.out.println(isVowel('O'));
	}

	public static boolean isVowel(char c) {
		c = Character.toUpperCase(c);
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
			return true;
		else 
			return false;
	}

	public static char getLetterGrade(int score) {
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

	public static int minOfThree(int a, int b, int c) {
//		if(a < b && a < c) {
//			return a;
//		} else if(b < a && b < c) {
//			return b;
//		} else {
//			return c;
//		}
		return min(min(a, b), c);
	}

	public static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	public static boolean inRange(int number) {
//		if(number < 10) {
//			return false;
//		} else if (number > 100) {
//			return false;
//		} else {
//			return true;
//		}
		return (number >= 10 && number <= 100);
	}

	public static void printSign(int number) {
//		if(number > 0) {
//			System.out.println("Positive");
//		} else if(number == 0) {
//			System.out.println("Zero");
//		} else {
//			System.out.println("Negative");
//		}

		String sign = (number > 0) ? "Positive" : ((number == 0) ? "Zero" : "Negative");
		System.out.println(sign);
	}

	public static boolean canVote(int age) {
//		if(age >= 18) {
//			return true;
//		}
//		return false;
//		return (age >= 18) ? true : false;
		return age >= 18;
	}

	public static int max(int a, int b) {
//		if(a > b) {
//			return a;
//		}
//		return b;
		return (b < a) ? a : b;
	}

	public static boolean isEven(int number) {
//		if (number % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
//		return (number % 2 == 0)? true : false; // ternary operation

		return number % 2 == 0;
	}

}
