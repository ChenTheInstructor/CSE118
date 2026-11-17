package p2;

import java.util.Arrays;

public class DemoTraditionalAndEnhancedForLoops {

	public static void main(String[] args) {
		String[] names = { "Renato", "Ronan", "Maksim", "Joao", "Kian", "Leonel", "Jake" };
		int[] numLetters = new int[names.length];
		String[] namesUpper = new String[names.length];
		String[] namesReverse = new String[names.length];

		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].toLowerCase();
			numLetters[i] = names[i].length();
			namesUpper[i] = names[i].toUpperCase();
			namesReverse[i] = names[names.length - 1 - i];
		}

		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(numLetters));
		System.out.println(Arrays.toString(namesUpper));
		System.out.println(Arrays.toString(namesReverse));
	}

}
