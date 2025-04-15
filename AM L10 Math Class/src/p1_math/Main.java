package p1_math;

public class Main {

	public static void main(String[] args) {
		// Math.random() returns a double between 0.0 and 1.0 but not include 1.0
		System.out.println((int) (Math.random() * 10) + 5);
	}

}
