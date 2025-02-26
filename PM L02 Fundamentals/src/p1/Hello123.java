package p1;

public class Hello123 {

	public static void main(String[] args) {
		//System.out.println("Hello \\\\n 123 + 1 , ? !");// \ escape key
		
//		System.out.print("hello");
//		System.out.println("\nbye");
		
		System.out.printf("%-10s%15s%15s%n", "Name", "Age", "GPA");
		System.out.println("--------------------------------------------");
		System.out.printf("%-10s%15d%15.2f%n", "John", 18, 3.5); // print format
		System.out.println("--------------------------------------------");
		System.out.printf("%-10s%15d%15.2f%n", "Suzy", 20, 4.0); // print format
	}

}
