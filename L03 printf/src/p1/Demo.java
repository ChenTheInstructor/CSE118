package p1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("\n-------------------------------------------");
		System.out.printf("%-3d%20s%10.2f%n",1, "Beef", 19.99); // "Hello" is a string
		System.out.printf("%-3d%20s%10.2f%n",2, "Fish", 25.99); 
		System.out.printf("%-3d%20s%10.2f%n",3, "Pork", 15.99); 
		System.out.printf("%-3d%20s%10.2f%n",4, "Eggs", 19.99); 
		System.out.println("-------------------------------------------");
		
//		System.out.printf("%-10.3f%-10d%-10s%n", 987.12345, 54321, "Bye");
//		System.out.printf("%-10.3f%-10d%-10s%n",123.456789, 12345, "Hello"); // "Hello" is a string
//		System.out.printf("%-10.3f%-10d%-10s%n", 987.12345, 54321, "Bye");
	}

}
