package p1;

public class Main {

	public static void main(String[] args) {
		String[][] users = new String[10][2];

		// fill the array with a random capital letter as username and two random
		// lowercase letters as password
		fillArray(users);
		showArray(users);
	}

	public static void showArray(String[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][0] + ", " + a[i][1]);
		}
	}

	public static void fillArray(String[][] a) {
		for (int i = 0; i < a.length; i++) {
			a[i][0] = getRandomUppercaseLetters(5);
			a[i][1] = getRandomLowercaseLetters(10);
		}
	}

	public static String getRandomLowercaseLetters(int numberOfLetters) {
		String str = "";
		for (int i = 0; i < numberOfLetters; i++) {
			str += getRandomLowercaseLetter();
		}
		return str;
	}

	public static String getRandomUppercaseLetters(int numberOfLetters) {
		String str = "";
		for (int i = 0; i < numberOfLetters; i++) {
			str += getRandomUppercaseLetter();
		}
		return str;
	}

	public static String getRandomUppercaseLetter() {
		return String.valueOf((char) ((int) (Math.random() * 26) + (int) 'A'));
	}

	public static String getRandomLowercaseLetter() {
		return String.valueOf((char) ((int) (Math.random() * 26) + (int) 'a'));
	}

	public static String get2RandomLowercaseLetters() {
		return getRandomLowercaseLetter() + getRandomLowercaseLetter();
	}

}
