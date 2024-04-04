package p3;

public class Main {

	public static void main(String[] args) {
		int n = 10; // number of terms to display
		int firstTerm = 0;
		int secondTerm = 1;
		
		for(int i = 1; i <= n; i++) {
			System.out.print(firstTerm + " ");
			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
