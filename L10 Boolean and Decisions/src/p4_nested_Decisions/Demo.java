package p4_nested_Decisions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		int age = 15;
//		boolean hasLicense = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Is it true that you have a license? T or F");
		scanner.nextLine();
		char reply = scanner.nextLine().toUpperCase().charAt(0);
		boolean hasLicense = false;
		if (reply == 'T') {
			hasLicense = true;
		}
				
		
		if(age >= 18) {
			if(hasLicense) {
				System.out.println("You can drive.");
			} else {
				System.out.println("You need a license to drive.");
			}
			
		} else {
			System.out.println("You're too young to drive.");
		}
		
//		if(age >= 18 && hasLicense) {
//				System.out.println("You can drive.");
//		} else {
//			System.out.println("You cannot drive.");
//		}
		
		
	}

}
