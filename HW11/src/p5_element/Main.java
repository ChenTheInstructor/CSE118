package p5_element;

import java.util.Scanner;

public class Main {
//	static int arraySize;
	public static void main(String[] args) {
		int arraySize = p4_sum_even_numbers.Main.getArraySize();
		int[] arr = p4_sum_even_numbers.Main.createArray(arraySize);
		p4_sum_even_numbers.Main.fillArray(arr);
		int value = getValue();
		boolean isPresent = checkElement(value, arr);
		System.out.println("The value was found? " + isPresent);
		
	}

	private static boolean checkElement(int value, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				return true;
			}
		}
		return false;
	}

	private static int getValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you are interested in: ");
		return scanner.nextInt();
	}

}
