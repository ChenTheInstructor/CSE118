package p2_modern;

import java.util.Scanner;

public class Demo_Modern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your letter grade: ");
		char grade = input.nextLine().toUpperCase().charAt(0);

		String remarks = switch (grade) {
		case 'A' -> "Above 90. Excellent job!";
		case 'B' -> "Between 80 and 90.";
		case 'C' -> "Between 70 and 80.";
		case 'D' -> {
			System.out.println("D is in danger of failing");
			System.out.println("Please come to see me after class.");
			yield "Between 60 and 70.";
		}
		case 'F' -> "Below 60.";
		default -> "Not a valid letter grade.";
		};
		
		System.out.println(remarks);
	}

}
