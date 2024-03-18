package p2_enhanced;

import java.util.Scanner;

public class Main_Enhanced {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a grade: ");
		String grade = scanner.nextLine().toUpperCase();
		String remarks = "";

		remarks = switch (grade) {
		case "A" -> "Excellent!";
		case "B+", "B" -> "Good!";
		case "C+", "C" -> "Okay";
		case "D+", "D" -> "Good try...";
		case "F" -> {
			System.out.println("Not great!");
			yield "Need more work.";
		}
		default -> {
			System.out.println("No such grade");
			yield "No comment.";
		}
		};
		System.out.println(remarks);
	}

}
