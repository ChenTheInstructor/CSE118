package p1_compound_operators;

public class Demo {

	public static void main(String[] args) {
		// A variable is just a named memory location on your computer
		int age = 20; // 4 bytes
//		0001010101010101010101010101101010101010101010= 20;
		double gpa = 3.0; // 8 bytes
		char middleInitial = 'M'; // 2 bytes
		int numberOfCredits; // 4 bytes  declare a variable
//		System.out.println(numberOfCredits);
		numberOfCredits = 12;
//		System.out.println(numberOfCredits);
		
		age = age + 1; // in CS, = means assignment or storing data on the right to variable on the left
		age += 1;
		
		numberOfCredits = numberOfCredits / 12;
		numberOfCredits -= 12;
		numberOfCredits /= 12;
		
	}

}
