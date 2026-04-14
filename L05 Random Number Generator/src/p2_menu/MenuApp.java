package p2_menu;

public class MenuApp {

	public static void main(String[] args) {
		showMenu();
		String s = showMenu();
		System.out.println(s);
	}
	
	public static String showMenu() {
		System.out.println("\n\t   MENU");
		System.out.println("\t1. Check Balance");
		System.out.println("\t2. Deposit");
		System.out.println("\t3. Withdraw");
		System.out.println("\t4. Exit");
		System.out.print("\n\tEnter your choice: ");
		return "Done"; // ends the method always!
//		System.out.println("Bye");
	}

}
