package p1_while_loops;

public class Demo {

	public static void main(String[] args) {
		int i = 1;
		while(true) {
			System.out.println(i++);
			if(i == 6) {
				break; // break the loop
			}
		}
//		while (i <= 5) {
//			System.out.println(i++);
////			++i;
//		}
	}

}
