package p3_switch;

public class Demo {
	/*
	 * syntax
	 * 	switch(expression) {
	 * case value1:
	 * 	// code to be executed
	 * 	break;
	 * case calue2:
	 * 	// code to be executed
	 * 	break;
	 * default:
	 * 	// code to be executed
	 * }
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int day = 5;
		
		switch(day) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		default:
				System.out.println("No such number for the day of the week");
		} 
	}

}
