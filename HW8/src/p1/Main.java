package p1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array = getNumbers();
		showArrayInOrder(array);
		System.out.println(getLargest(array));
		System.out.println(getSmallest(array));
		System.out.println("The average is " + getAverage(array));
	}
	
	public static double getAverage(int[] a) {
		return (double)getTotal(a) / a.length;
	}
	
	public static int getTotal(int[] a) {
		int total = 0;
		for(int n : a) {
			total += n;
		}
		return total;
	}
	
	public static int getSmallest(int[] a) {
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < smallest) {
				smallest = a[i];
			}
		}
		return smallest;
	}
	
	public static int getLargest(int[] a) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}

	public static void showArrayInReversedOrder(int[] a) {
		for(int j = a.length-1; j >= 0; j--) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}

	public static void showArrayInOrder(int[] a) {
//		for(int i : a) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		System.out.println(Arrays.toString(a));
	}

	public static int[] getNumbers() {
		int[] arr = new int[100];
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int n = scanner.nextInt();

		while (n >= 0) {
			arr[count++] = n;
			System.out.println("Enter a whole number: ");
			n = scanner.nextInt();
		}

		return Arrays.copyOf(arr, count);
	}

}
