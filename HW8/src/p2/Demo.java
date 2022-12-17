package p2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String[] names = getNames();
		System.out.println(Arrays.toString(names));
//		Arrays.sort(names);
		System.out.println(getLargest(names));
		System.out.println(getSmallest(names));
//		System.out.println(getSmallest(names));
	}
	
//	public static String getLargest(String[] names) {
//		Arrays.sort(names);
//		return names[names.length-1];
//	}
	
	public static String getLargest(String[] names) {
		String largest = names[0];
		for(int i = 1; i < names.length; i++) {
			if(names[i].compareTo(largest) > 0) {
				largest = names[i];
			}
		}
		return largest;
	}
	
	public static String getSmallest(String[] names) {
		String smallest = names[0];
		for(int i = 1; i < names.length; i++) {
			if(names[i].compareTo(smallest) < 0) {
				smallest = names[i];
			}
		}
		return smallest;
	}
	
//	public static String getSmallest(String[] names) {
//		Arrays.sort(names);
//		return names[0];
//	}
	
	public static void showReversedOrder(String[] a) {
		for(int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void showArray(String[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public static String[] getNames() {
		String[] arr = new String[5];
		Scanner scanner = new Scanner(System.in);
		final int MAX_NUMBER = 5;
		for(int k = 0; k < MAX_NUMBER; k++) {
			System.out.println("Enter a name: ");
			arr[k] = scanner.nextLine();
		}
		return arr;
	}

}
