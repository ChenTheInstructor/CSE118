package p4_ternary_operrator;

public class Main {

	public static void main(String[] args) {
//		int score = 95;
//		String letterGrade = (score >= 90)? "A" :(score >= 80) ? "B" : 
//			(score >= 70) ? "C" : (score >= 60) ? "D" : "F";
//		System.out.println("The letter grade is: " + letterGrade);
		
		int score = 46;
		String letterGrade = "";
		
		if(score >= 90) {
			letterGrade = "A";
		} else if (score >= 80) {
			letterGrade = "B";
		} else if (score >= 70) {
			letterGrade = "C";
		} else if(score >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		
		System.out.println("The letter grade is: " + letterGrade);
	}

}
