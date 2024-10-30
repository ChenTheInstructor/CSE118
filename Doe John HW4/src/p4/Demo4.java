package p4;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two doubles and an operator: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		char operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 + n2));
			break;
		case '-':
			System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 - n2));
			break;
		case '*':
			System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 * n2));
			break;
		case '/':
			System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 / n2));
			break;
		default:
			System.out.println("The operator is invalid.");	
		}
	}

}
