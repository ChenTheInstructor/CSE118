package p2;

import java.util.Arrays;

public class DemoEnhancedForLoop {

	public static void main(String[] args) {
		String[] names = { "Renato", "Ronan", "Maksim", "Joao", "Kian", "Leonel", "Jake" };
		System.out.println(Arrays.toString(names));
		int[] numLetters = new int[names.length];
		String[] namesUpper = new String[names.length];
		String[] namesReverse = new String[names.length];
		
		int i = 0;
		for(String name : names) {
			names[i] = name.toLowerCase();
			numLetters[i] = name.length();
			namesUpper[i] = name.toUpperCase();
			namesReverse[names.length - 1 - i] = name;
			i++;
		}
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(numLetters));
		System.out.println(Arrays.toString(namesUpper));
		System.out.println(Arrays.toString(namesReverse));
	}

}
