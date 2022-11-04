package p5_shortcut;

public class Main {

	public static void main(String[] args) {
		//nested for-loop
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.printf("%5d", (i * j));
			}
			System.out.println();
		}
	}

}
