package p3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		char[] arr = getCharArray();
		System.out.println(Arrays.toString(getUniqueArray(arr)));
		
	}
	
	public static char[] getUniqueArray(char[] arr) {
		char[] uniqueArray = new char[arr.length];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isUnique(arr[i], uniqueArray) == true) {
				uniqueArray[count++] = arr[i];
			}
		}
		
		return Arrays.copyOf(uniqueArray, count);
	}
	
	public static boolean isUnique(char c, char[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(c == arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static char[] getCharArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string of 10 characters: ");
		String str = scanner.nextLine();
		while(str.length()!= 10) {
			System.out.println("Enter a string of 10 characters: ");
			str = scanner.nextLine();
		}
		
		char[] arr = str.toCharArray();
		return arr;
	}

}
