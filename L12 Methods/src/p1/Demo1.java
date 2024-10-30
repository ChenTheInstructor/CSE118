package p1;

public class Demo1 {
	
	// instance methods
	// no input (no parameters), no return (void)
	public void printHello() {
		System.out.println("Bye, World!");
	}
	
	// no return (void), there is input (one parameter)
	public void greetUser(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	// there is return (int), there is input (two parameters)
	public int addNumbers(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		return sum;
		
	}
	
	// There is return (int), there is input (two parameters)
	public int multiplyNumbers(int a, int b) {
		return a * b;
	}
	
	// method overloading. Multiple methods of the same name but different
	// parameters (type, number of paramters, or both)
	double multiplyNumbers(double a, double b) {
		return a * b;
	}
	
	
	// static methods
	public static void greetings(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static void main(String[] args) {
		Demo1.greetings("Susan");
		greetings("Zack");
		Demo1 d1 = new Demo1();
		d1.printHello();
		d1.printHello();
//		Demo1 d2 = new Demo1();
		String n = "Alan";
		d1.greetUser("Joey");
		d1.greetUser("Amy");
		d1.greetUser(n);
		int result = d1.addNumbers(20, 10);
		System.out.println("The result is: " + result);
		
		System.out.println(d1.multiplyNumbers(5, 3));
		System.out.println(d1.multiplyNumbers(1.1, 1.1));
	}

	
}
