package p2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		char[] grades = getCharArray();
		int score = getScore();
		showGrades(grades);
		
	}
	
	public static void showGrades(char[] a) {
		for(char c : a) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public static int getScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your score: ");
		return scanner.nextInt();
	}
	
	public static char[] getCharArray() {
		return new char[] {'A', 'B', 'C', 'D', 'F'};
	}

}
