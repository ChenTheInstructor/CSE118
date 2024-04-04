package p5;

public class Main {

	public static void main(String[] args) {
		int columns = 5;
		int rows = 10;
		// nested for loop
		for (int i = 0; i < rows; i++) { // outer loop
			for (int j = 0; j < columns; j++) {  // inner loop
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
