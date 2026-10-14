package p3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create a Scanner object
		// Each object contains two components: One is data, the other is methods
		// nextLine(), next(), nextInt(), nextDouble(), nextBoolean(). They work with a Scanner object
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Your name is: " + name);
		
//		input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter your major: ");
		String major = input.nextLine();
		
//		input.nextLine();
		
		System.out.printf("%-20s%10d%20S%n%n", name, age, major);
		
		int index = name.indexOf(" ");
		if(name.charAt(5) == 'H') {
			System.out.println("The last name starts with the letter H");
		} else {
			System.out.println("The last name does not start with the letter H");
		}
		
//		if(name.length() >= 15) {
//			System.out.println("It's a long name.");
//		} 
//		
//		if(age >= 40) {
//			System.out.println("It's not a traditional student.");
//		}
//		
//		if(major.equalsIgnoreCase("Computer Science")) {
//			System.out.println("It's Computer Science major!");
//		}
		
		if(name.length() >= 10 && age < 20 && major.equals("Math")) {
			System.out.println("A student major in Math,  less than 20 years old, with a long name");
			
		}
		
		if(major.equalsIgnoreCase("math") 
				|| major.equalsIgnoreCase("Computer Science") 
				|| major.equals("Science")){
			System.out.println("A STEM major.");
		}
	}

}
