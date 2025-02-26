package p1;

// class header
// public: access modifier
// default access: package access
// private: only this local class can access
public class HelloWorld {
	// main method stub (header). 
	// main method serves as the starting point for the JVM to begin running
	public static void main(String[] args) {
//		System.out.println("hi"); // string
//		System.out.println(123 + 7);
//		System.out.println(3.5 + 0.5);
//		System.out.println("Bye");
		System.out.printf("%-10S%10S%10S%n", "Name", "Age", "GPA");
		System.out.println("--------------------------------------------");
		System.out.printf("%-10s%10d%10.2f%n", "Joey", 18, 4.0);
		System.out.printf("%-10s%10d%10.2f%n", "Suzy", 19, 3.5);
		System.out.println("--------------------------------------------");
	}
}
