package p2;

import java.util.Scanner;

public class DemoGrades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your score: ");
			double score = scanner.nextDouble();
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
			System.out.println("Have a nice day!");
		}
	}

}
