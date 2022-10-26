package p6_selection;

public class Main {

	public static void main(String[] args) {
		int a = 25;
		int b = 20;

		if (a > b) {
			int c = a - b;
			System.out.println("a is greater than b.");
			System.out.println("a - b = " + c);
		} 
		
		if (a - b > 5) {
			System.out.println("a - b is greater than 5");
		}

		System.out.println("The End");
	}

}
