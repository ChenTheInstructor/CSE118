package p6;

public class Main {

	public static void main(String[] args) {
		System.out.println(getLetterGrade(105));
	}

	public static char getLetterGrade(int score) {
		// nested if-else
//		if(score >= 90 && score <= 100) {
//			return 'A';
//		} else if(score >= 80) {
//			return 'B';
//		} else if(score >= 70) {
//			return 'C';
//		} else if(score >= 60) {
//			return 'D';
//		} else if (score >= 0 && score < 60){
//			return 'F';
//		} else {
//			return ' ';
//		}
		
		char grade = switch(score / 10) {
		case 9, 10 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		case 0, 1, 2, 3, 4, 5 -> 'F';
		default -> ' ';
		};
		return grade;
	}
}
