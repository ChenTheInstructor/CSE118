package p2;

public class Demo {

	public static void main(String[] args) {
		String name = "Jose";
		double n1 = 85;
		double n2 = 90;
		double n3 = 95;
		double average = getAverage(name, n1, n2, n3);
		System.out.println("Your average is: " + average);
	}
	
	// arguments are "passed to the method by value"!!!! It is the values crossing the caller and callee
	public static double getAverage(String name, double n1, double n2, double n3) {
		System.out.println("Hey " + name);
		return (n1 + n2 + n3) / 3;
	}

}
