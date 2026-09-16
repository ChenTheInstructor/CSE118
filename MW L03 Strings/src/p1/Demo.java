package p1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello\n\tWorld!\"\"");
		System.out.println("Hello\n\tWorld!\"\"".length());
		System.out.println("Hello\n\tWorld!\"\"".charAt(2));
		System.out.println("Hello\n\tWorld!\"\"".substring(2));
		String str4 = "Hello World".substring(2, 5);
		System.out.println(str4);
		
		System.out.println("Hello".replace("ll", "xx"));
		
		System.out.println("hello".indexOf("ll"));
		System.out.println("  	hello   world   ".trim());
		
		
//		String str1 = "Hello";
//		String str2 = "Hello";
//		str2 = "hi";
//		
//		str1 = null;
//		
//		System.out.println(str1 == str2);
		
		
//		String str2 = new String("Hello");
//		System.out.println(str1 == str2);
	}

}
