package p1;

public class Main {

	public static void main(String[] args) { // caller
//		greet();
//		greet("Bye, World!");
//		String newMessage = getMessage("Hello");
//		System.out.println(newMessage);
//		System.out.println(getMessage("Hi"));
//		greet("Howdy", 3);
		String newMessage = greetNTimes("Hi", 10);
		System.out.println(newMessage);

	}

	// basic method
	public static void greet() { // callee
		System.out.println("Hello World!");
	}
	
	// method with a parameter
	public static void greet(String message) {
		System.out.println(message);
	}
	
	// another overloaded method
	public static void greet(String message, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(message + ", my friend!");
		}
	}
	
	public static String greetNTimes(String message, int n) {
		String finalMessage = "";
		for(int i = 0; i < n; i++) {
			finalMessage += message + ", ";
		}
		return finalMessage;
	}
	
	// method with a return value
	public static String getMessage(String message) {
		return message + " friend!";
	}
	
	// Overloaded methods

}
