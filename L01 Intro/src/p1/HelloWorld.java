package p1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();

		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();

		scanner.nextLine();
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.printf("%-5S%10S%10S\n","Name", "Age", "GPA");
		System.out.printf("%-5s%10d%10.2f\n",name, age, gpa);
		

//		System.out.println("Your name is: " + name);
//		System.out.println("Your age is: " + age);
//		System.out.println("Next year your age will be: " + (++age));
//		System.out.println("Your GPA is: " + gpa);

	}

}
