package p1_string;

public class DemoPrintString {

	public static void main(String[] args) {
		// \: escape character
		System.out.println("Hello\\nWorld!\\n\\t2 + 5");
		System.out.println("abc\\123");
		
		String format = "%-15S%25d%10.2f%n";
		String name1 = "000000000000Jose";
		String name2 = "JohnnyJohnny";
		int age1 = 20;
		int age2 = 22;
		double gpa1 = 3.512345;
		double gpa2 = 2.5;
		double gpa3 = 2.;
		
		System.out.printf(format, name1, age1, gpa1);
		System.out.printf(format, name2, age2, gpa2);
		System.out.printf(format, name2, age2, gpa3);
	}

}
