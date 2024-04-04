package p2;

public class Main {

	public static void main(String[] args) {
		int number = 20; // calculate the factorial of 5
		long factorial = 1;
		
		int i = 1;
		while(i <= number) {
//			factorial = factorial * i;
			factorial *= i;
			i++;
		}
		System.out.println("Factorial of " + number + " is " + factorial);
	}

}
