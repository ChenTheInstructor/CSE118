package p1; // notice java key words in purple

// Demo.class is the bytecode file name
// Demo.java is the source code file name
public class Demo { // class header. public keyword is known as access modifier
	public static void main(String[] args) { // main method header
		String greetings = "Bye World!";// Assign the value of "Hello World!" to a memory location labeled as greetings
	
//		"Hello World!" = String greetings; Illegal statement
		
		System.out.println(greetings); // This is called variable declaration. Needed for the first time creating a variable
		System.out.println(greetings); // The label is known as a variable
		System.out.println(greetings); // Variable: a label for a memory location of a given data type
	}
}
