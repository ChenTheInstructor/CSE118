package p4_sum_even_numbers;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arraySize = getArraySize();
		int[] arr = createArray(arraySize);// arr contains the address of the array
		display(arr); // in Java, when a method is called, parameters/ arguments are always passed by their values
//		double sum = add(10.5, 5.5);
//		System.out.println(sum);
		fillArray(arr);
		display(arr);
		int totalEvens = getTotalOfEvens(arr);
		System.out.println("The total of all even numbers: " + totalEvens);
	}
	
	public static int getArraySize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		return scanner.nextInt();
	}
	
	private static int getTotalOfEvens(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				total += arr[i];
			}
		}
		return total;
	}

	public static void fillArray(int[] a) {
		Random rand = new Random();
		for(int i = 0; i < a.length; i++) {
//			a[i] = (int) (Math.random() * 101);
			a[i] = rand.nextInt(21);
		}
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static void display(int[] x) {
		for(int n : x) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static int[] createArray(int arraySize) {
		return new int[arraySize];
	}

}
