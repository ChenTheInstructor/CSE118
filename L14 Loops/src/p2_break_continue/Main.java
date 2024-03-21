package p2_break_continue;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 5; i++) {
			if(i == 4) {
//				continue; // start the next iteration without finishing the rest of the block
				break; // get out and terminate the loop, no future iterations
			}
			System.out.println("Hi: " + i);
		}
	}

}
