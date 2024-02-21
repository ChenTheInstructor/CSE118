package p1_string;

public class Main {

	public static void main(String[] args) {
		String str1 = "John Doe";
//		String str2 = "John";
//		System.out.println(str1 == str2);
//		String str3 = new String("John");
//		System.out.println(str1 == str3);
		
		// charAt(int index)
		System.out.println(str1.charAt(3));
		System.out.println("Hello".charAt(4));
		
		// length()
		System.out.println(str1.length());
		System.out.println("Hello".length());
		
		// combine them
		String str2 = "fdafdsag fdgfds gfdsg fds gfdsgfdsgfdg gfds fafafgdagd gfdsgfds";
		System.out.println(str2.charAt(str2.length()-1));
		
		// substring(int beginIndex)
		System.out.println(str1.substring(2, 7));
		
		// contains(String str)
		System.out.println(str1.contains("doe"));
		
		// startsWith(String str)
		System.out.println("Hello World".startsWith("Hell"));
		
		// endsWith(String str)
		System.out.println("Hello World".endsWith("ld"));
		
		// equals(String str)
		System.out.println(str1.equals("John Doe"));
		
		// equalsIgnoreCase(String str)
		System.out.println(str1.equalsIgnoreCase("John DOE"));
		
		//indexOf(String str)
		System.out.println(str1.indexOf("o"));
		
		// lastIndexOf(String str)
		System.out.println(str1.lastIndexOf("o"));
		
		// replace(char c1, char c2)
		System.out.println(str1.replace('o', 'a'));
		System.out.println(str1);
		
		// replaceAll(String str1, String str2)
		System.out.println(str1.replaceAll("John", "Jane"));
		
		// split(String str)
		System.out.println(str1.split(" "));
		
		// toLowerCase()
		System.out.println(str1.toLowerCase());
		// toUpperCase()
		//trim()
		System.out.println(" John Doe  ".trim());
		
		// Character
		System.out.println(Character.isDigit('A'));
		
	}

}
