package p1_standard_output;

public class HelloWorld {
	// method: main method
	public static void main(String[] args) {
//		System.out.print("\tHello\nWorld!" + "\n\nBye\t\tWorld!");
//		System.out.print("Bye World!");
		
		System.out.printf("%-10S%-10s%10d%10.2f%n", "Hello", "World!", 500+200, 123.45678*1.5);
		System.out.printf("%-10S%-10s%n", "Hello", "World!");
		
	}

}
