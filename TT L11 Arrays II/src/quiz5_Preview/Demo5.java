package quiz5_Preview;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = new String[6];
		
		System.out.println("Enter 6 string values: ");
		for(int j = 0; j < 6; j++) {
			names[j] = scanner.next();
		}
		
		System.out.println(Arrays.toString(names));
		String[] newArr = new String[names.length];
		
		for(int i = names.length - 1; i >= 0; i--) {
			newArr[names.length - 1 - i] = names[i];
		}
		
		System.out.println(Arrays.toString(newArr));
	}

}
