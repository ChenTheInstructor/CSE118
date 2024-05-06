package p02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// Write program that would ask the user for n integers using a method
	// Calculate the average of the integers using a method
	// display the average using a method
	// display all the integers using a method
	public static void main(String[] args) {
		int size = getSize();
		int[] arr = getIntegers(size);
		displayArray(arr);
		double average = getAverage(arr);
		displayAverage(average);
		int largest = getLargest(arr);
		int smallest = getSmallest(arr);
		int[] both = getLargestAndSmallest(arr);
		display(largest);
		display(smallest);
		displayBoth(both);
		System.out.println(hasDuplicate(arr));
	}

	private static boolean hasDuplicate(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int num = arr[i];
			for(int j = (i + 1); j< arr.length; j++) {
				if(num == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	private static void displayBoth(int[] both) {
		System.out.println(Arrays.toString(both));
	}

	private static void display(int number) {
		System.out.println(number);
	}

	private static int[] getLargestAndSmallest(int[] arr) {
		int[] both = { getLargest(arr), getSmallest(arr) };
		return both;
	}

	private static int getSmallest(int[] arr) {
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
	}

	private static int getLargest(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

	private static void displayAverage(double average) {
		System.out.printf("The avarage is: %.2f\n", average);
	}

	private static double getAverage(int[] arr) {
		double total = 0.0;// create a accumulator
		for (int n : arr) {
			total = total + n;
		}
		return total / arr.length;
//		double total = arr[0] + arr[1] + arr[2];
	}

	private static void displayArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	private static int[] getIntegers(int size) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter integer " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	private static int getSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		return scanner.nextInt();
	}

}
