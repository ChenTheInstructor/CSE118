package p3_processing;

public class DemoProcessStrings {
// substring
// indexOf
//  charAt
// toUpperCase
// toLowerCase
// length
	public static void main(String[] args) {
		String name = "John Adam Jonathan Doe";
		int firstSpaceIndex = name.lastIndexOf(" ");
		String firstName = name.substring(0, firstSpaceIndex);
		String lastName = name.substring(firstSpaceIndex + 1);
		System.out.println("First Name: " + firstName + " Last Name: " + lastName);
		char firstInitial = firstName.charAt(0);
		char lastInitial = lastName.charAt(0);
		System.out.println("First Initial: " + firstInitial);
		System.out.println("Last Initial: " + lastInitial);
		System.out.println(name.charAt(firstSpaceIndex + 1));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
	}

}
