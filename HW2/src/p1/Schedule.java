package p1;

public class Schedule {

	public static void main(String[] args) {
		String fmt = "%-23s%-10s%-10s%-10s%-10s%-10s%n";
		System.out.printf(fmt, "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
		System.out.printf(fmt, "09:30 AM -- 11:10 AM", "", "CSE118", "", "CSE118", "");
		System.out.printf(fmt, "11:30 AM -- 01:10 PM", "CHE133", "", "CHE133", "", "");
		
	}

}
