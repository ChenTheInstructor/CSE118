package p3_increment_and_decrement_operators;

public class Main {

	public static void main(String[] args) {
		int i = 3;
		int j  = 5;
		// preincrement
//		++i; // i = i + 1;
		//postincrement
//		i++;
		
//		j++;
//		++j;
//		System.out.println(j++); 
		int k = i-- + j--;
		System.out.println(k);
		System.out.println(i);
		System.out.println(j);
	}

}
