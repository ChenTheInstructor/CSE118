package p7;

public class Main {

	public static void main(String[] args) {
		int rowNum = 5;

		for (int row = 1; row <= rowNum+1; row++) {
			for (int col = 0; col < rowNum; col++) {
				if (col >= rowNum - row) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
