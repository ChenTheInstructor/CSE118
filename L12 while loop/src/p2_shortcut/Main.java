package p2_shortcut;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			for (int j = 0; j < 2; j++) {
				System.out.println("hi " + j);
			}
			if(i == 3) {
				break;
			}
			System.out.println("Bye!");
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("end");
	}

}
