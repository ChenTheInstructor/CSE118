package p2_for_loop;

public class DemoExample2 {

	public static void main(String[] args) {
		// scope of a variable determines the visibility of that variable
		int i = 10; // declare the i in the main method, hence it's visible in the main method
		for(; i > 0; ) {
			System.out.println("i = " + i + "\n");
		}
		System.out.println("The final i = " + i);
	}

}
