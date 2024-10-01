package p1_display_output;

public class DemoReview {
	/* 1.	Display information on the console.
		a.	System.out.print()
		b.	System.out.println()
		c.	System.out.printf()
	 */

	public static void main(String[] args) {
		int age = 20;
		double gpa = 4.0;
		String name = "Joey"; // /n: escape sequence. Move to next line instead
//		System.out.println(name); // if literally, put them in ""
		System.out.printf("%-10s%10d%10.3f%n", name, age, gpa); // f means format. 

	}

}
