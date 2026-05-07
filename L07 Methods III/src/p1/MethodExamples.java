package p1;

public class MethodExamples {

	public static void main(String[] args) { // caller
		showMenu();
		displayMessage("Are you ready to order? "); // argument
		displayMessage("Okay, what would you like to order?"); // argument
		displayMessage("It has to be a string!!!!"); // argument
		sum(10, 20, "John"); // three arguments
		sum(5, 10.7, "Suzie"); // three arguments

		System.out.println(getStandardGreeting());

		double myTotal = 0;
		myTotal += begDadForMoney();
		myTotal += begDadForMoney();
		myTotal += begDadForMoney();
		System.out.println("Now my total amount is: " + myTotal);

		String formattedGreeting = formatGreeting("John Doe", 20);
		System.out.println(formattedGreeting);
	}

	// Type 4 method definition: with parameters and with return value
	public static String formatGreeting(String str, int hour) {
		if (hour < 12) {
			return "Good morning, " + str;
		} else if(hour < 19) {
			return "Good afternoon, " + str;
		} else {
			return "Good evening, " + str;
		}
	}

	// Type 3 method definition: no parameters but with return value
	public static String getStandardGreeting() {
		return "Good morning!";
	}

	public static double begDadForMoney() {
		return 100.0;
	}

	// Type 2 method definition: with parameters but no return type
	public static void displayMessage(String str) { // one parameter: placeholder
		System.out.println(str);
	}

	public static void sum(int x, double y, String str) { // three parameters: placeholders
		System.out.println("Hey " + str + ", the sum is: " + (x + y));
	}

	// Type 1 method definition: no parameters and no return value
	public static void sayHi() { // callee
		System.out.println("Hi");
	}

	public static void showMenu() {
		System.out.println("\t\tABCDEF CAFE");
		System.out.println("\t\t(631) 123-4567");
		System.out.println("\t--------------------------");
		System.out.printf("\t%-5s%10S%10S%n", "1", "Beef", "19.99");
		System.out.println("\t--------------------------");

	}

}
