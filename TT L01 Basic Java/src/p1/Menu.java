package p1;

public class Menu {

	public static void main(String[] args) {
		
		String pageHeading; // declare a variable of String type
		// = means assigning a value to a variable which is a memory location
		pageHeading = "\n\n\t\t\tABC Restaurant" +
				"\n\t\t\t(631)234-5678" +
				"\n\t\t\t1 Main Street" + 
				"\n\t\t       Selden, NY 11784"; 
		String dashLine = "\t-----------------------------------------------";
		
		System.out.println(pageHeading);
		System.out.println(dashLine);
		System.out.println("\t1.\t\tFISH\t\t$19.99" );
		System.out.println("\t2.\t\tEGGS\t\t$9.99" );
		System.out.println("\t3.\t\tBEEF\t\t$14.99" );
		System.out.println(dashLine);
		System.out.println(pageHeading);
		System.out.println(dashLine);
	}

}
