package p3_print_random_even_numbers;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			int randNum = (int)(Math.random() * 10) + 1;
			
			if(randNum == 10) {
				break;
			}
			
			if(randNum % 2 == 1) {
				continue;
			}
			
			System.out.println(randNum);
		}
	}

}
