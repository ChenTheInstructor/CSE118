package p1;

public class Main {

	public static void main(String[] args) {
		String format = "|%-23S|%-15S|%-15S|%-15S|%-15S|%-15S|%n";
		String dashes10 = "---------------";
		String dashes25 = "-----------------------";
		int credits = 20;
		double tuition = 7255.25;
		
		System.out.printf(format, dashes25,dashes10,dashes10,dashes10,dashes10,dashes10);
		System.out.printf(format, "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
		System.out.printf(format, dashes25,dashes10,dashes10,dashes10,dashes10,dashes10);
		System.out.printf(format, "09:30 AM -- 11:10 AM", "ENG101", "", "ENG101", "", "");
		System.out.printf(format, dashes25,dashes10,dashes10,dashes10,dashes10,dashes10);
		System.out.printf(format, "11:30 AM -- 01:10 PM", "", "CSE118", "", "CSE118", "");
		System.out.printf(format, dashes25,dashes10,dashes10,dashes10,dashes10,dashes10);
		System.out.printf(format, "01:30 PM -- 03:10 pm", "MAT141", "", "MAT141", "", "");
		System.out.printf(format, dashes25,dashes10,dashes10,dashes10,dashes10,dashes10);
		System.out.printf(format, "06:00 pM -- 07:40 PM", "", "CHE130", "", "CHE130", "");
		System.out.printf(format, dashes25,dashes10,dashes10,dashes10,dashes10,dashes10);
		System.out.println("Total number of credits: " + credits);
		System.out.println("Total tuition paid per year: $" + tuition);
		System.out.println("Total tuition paid per semester: $" + tuition/2);
	}

}
