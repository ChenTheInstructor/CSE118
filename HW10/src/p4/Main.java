package p4;

public class Main {

	public static void main(String[] args) {
		System.out.println(reverseString("Morning"));
	}
	
	
	// hello
	public static String reverseString(String str) {
//		String revStr = "";
//		for(int i = 0; i < str.length(); i++) {
//			revStr = str.charAt(i) + revStr;
//		}
		
//		for(int i = str.length()-1; i >= 0; i--) {
//			revStr += str.charAt(i); // revStr = revStr + str.charAt(i);
//		}
		
		StringBuilder reversed = new StringBuilder(str);
		return reversed.reverse().toString();
	}

}
