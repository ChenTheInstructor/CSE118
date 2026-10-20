import java.util.Scanner;

public class DemoVowel {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = kb.nextLine().charAt(0);
		switch(letter) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': 
		case 'y': System.out.println("vowel"); break;
		default: System.out.println("Consoneant");
		}
	}

}
