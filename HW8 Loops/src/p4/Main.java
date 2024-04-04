package p4;

public class Main {

	public static void main(String[] args) {
		String str = "Race Tar";
		str = str.toLowerCase().replaceAll(" ", "");

		int leftIndex = 0;
		int rightIndex = str.length() - 1;
		boolean isPalindrome = true;
		
		while(leftIndex < rightIndex) {
			if(str.charAt(leftIndex) != str.charAt(rightIndex)) {
				isPalindrome = false;
				break;
			}
			leftIndex++;
			rightIndex--;
		}
		
		if(isPalindrome) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is NOT a palindrome");
		}
	}

}
