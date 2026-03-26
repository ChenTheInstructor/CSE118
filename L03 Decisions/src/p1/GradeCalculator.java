package p1;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a score (0 - 100): ");
		double score = scanner.nextDouble();
		
		if(score < 0 || score > 100) {
			System.out.println("Invalid score!");
		} else if(score < 60) {
			System.out.println("F");
		} else if (score < 65) {
			System.out.println("D");
		} else if (score < 70) {
			System.out.println("D+");
		} else if (score < 75) {
			System.out.println("C");
		} else if (score < 80) {
			System.out.println("C+");
		}else if (score < 85) {
			System.out.println("B");
		} else if (score < 90) {
			System.out.println("B+");
		} else {
			System.out.println("A");
		}
		
//		if(score < 0 || score > 100) {
//			System.out.println("Invalid score!");
//		} else if(score >= 90) {
//			System.out.println("A");
//		} else if (score >= 85) {
//			System.out.println("B+");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 75) {
//			System.out.println("C+");
//		} else if (score >= 70) {
//			System.out.println("C");
//		}else if (score >= 65) {
//			System.out.println("D+");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
	}

}
