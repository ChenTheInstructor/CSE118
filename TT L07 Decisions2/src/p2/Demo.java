package p2;

public class Demo {

	public static void main(String[] args) {
		int score = 100;
		
		if(score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else { // catched all other possibilities
			System.out.println("F");
		}
	}

}
