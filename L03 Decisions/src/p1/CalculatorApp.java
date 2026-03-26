package p1;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a math expression ( 2 + 4): ");
		String expression = scanner.nextLine();
		String s1 = expression.substring(0, expression.indexOf(" "));
		double n1 = Double.parseDouble(s1);
		String s2 = expression.substring(expression.lastIndexOf(" ") + 1);
		double n2 = Double.parseDouble(s2);
		char operator = expression.charAt(expression.indexOf(" ") + 1);
		
		double result = switch(operator) {
		case '+' -> n1 + n2;
		case '-' -> n1 - n2;
		case '*' -> n1 * n2;
		case '/' -> n1 / n2;
		default -> Double.MAX_VALUE;
		};
		
		System.out.println(n1 + " " + operator + " " + n2 + " = " + result );
	}

}
