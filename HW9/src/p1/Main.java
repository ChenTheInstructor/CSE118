package p1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		String[] a = {"A", "B", "C"};
//		String[] b = deepCopy(a);
//		System.out.println(a == b);
//		
////		System.out.println(Arrays.toString(a));
//		a[0] = "Z";
//		System.out.println(Arrays.toString(b));
//		
//		
//		int[] a = {1, 2, 3, 4};
//		int[] b = {1, 5, 3, 4};
//		System.out.println(isIdentical(a, b));

//		String[] a = { "A", "B", "C", "D" };
//		String[] b = { "a", "b", "c" };
//		String[] c = join3(a, b);
//		System.out.println(Arrays.toString(c));

//		System.out.println(getNumberOfCapitalLetters2("HelLO"));

//		int[] a = { 2, 0, 2, 4, 7};
//		System.out.println(getSmallestValueIndex(a));
//		System.out.println(Arrays.toString(getCharArrayOfUpperCaseLetters(10)));
//		int[] arr = getNumberArray(10);
//		System.out.println(Arrays.toString(arr));
		int[] a = {1, 2, 4, 6, 5};
		System.out.println(getEvenNumbers(a));
	}
	
	public static int getEvenNumbers(int[] a) {
		int total = 0;
		for(int i = 0; i< a.length; i++) {
			if(a[i]%2 == 0) {
				total += a[i];
			}
		}
		return total;
	}
	
	public static int[] getNumberArray(int max) {
		int[] a = new int[max];
		for(int i = 0; i < max; i++) {
			a[i] = (int)(10 + Math.random() * 11);
		}
		return a;
	}
	
	public static char[] getCharArrayOfUpperCaseLetters(int max) {
		char[] a = new char[max];
		for(int i = 0; i < max; i++) {
			char c = (char) ('A' + (int)(Math.random() * 26));
			a[i] = c;
		}
		return a;
	}

	public static int getSmallestValueIndex(int[] a) {
		int smallest = Integer.MAX_VALUE;
		int smallestIndex = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}

	public static int[] getUniqueArray(int[] a) {
		int[] temp = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < temp.length; j++) {
				if (a[i] == temp[j]) {
					isUnique = false;
				}
			}
			if (isUnique) {
				temp[count++] = a[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public static int getNumberOfCapitalLetters2(String str) {
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				count++;
			}
		}
		return count;
	}

	public static int getNumberOfCapitalLetters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		return count;
	}

	public static String[] join3(String[] a, String[] b) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		String[] c;

		if (a.length > b.length) {
			c = new String[a.length];
		} else {
			c = new String[b.length];
		}
//		while (true) {
		while (aIndex < a.length && bIndex < b.length) { // neither finished
			c[cIndex++] = a[aIndex++] + b[bIndex++];
		}

		while (aIndex < a.length) { // b finished but a is not
			c[cIndex++] = a[aIndex++];
		}

		while (bIndex < b.length) { // a finished but b is not
			c[cIndex++] = b[bIndex++];
		}
//			break;
//		}

		return c;

	}

	public static String[] join2(String[] a, String[] b) {

		if (a.length > b.length) {
			String[] c = new String[a.length];
			for (int i = 0; i < b.length; i++) {
				c[i] = a[i] + b[i];
			}
			for (int j = b.length; j < a.length; j++) {
				c[j] = a[j];
			}
			return c;
		} else {
			String[] c = new String[b.length];
			for (int i = 0; i < a.length; i++) {
				c[i] = a[i] + b[i];
			}
			for (int j = a.length; j < b.length; j++) {
				c[j] = b[j];
			}
			return c;
		}
	}

	public static String[] join(String[] a, String[] b) {
		String[] c = new String[a.length];
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + " " + b[i];
		}
		return c;
	}

	public static boolean isIdentical(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static String[] deepCopy(String[] a) {
		String[] b = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}

	public static String[] shallowCopy(String[] array) {
		String[] a = array;
		return a;
	}

}
