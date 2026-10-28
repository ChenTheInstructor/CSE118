package p2_for_loop;

public class Demo_For_Loop {

	public static void main(String[] args) {
		// part 1: initialization
		// part 2: condition, always a boolean value (true or false)
		//			Relational operators: ==, !=, >, >=, <, <=
		//			Logical operators: &&, ||, !
		// part 3: update: the count is updated with a new value after each iteration
		for(int i = 0; i < 1000; i++) {
			System.out.println("Hello");
			System.out.println("Bye");
			System.out.println("count = " + (i + 1)+ "\n");
		}
		System.out.println("End of the for-loop");
		//Order of operation:
		// 1. initialization: int count = 1;
		// 2. check condition: if true, do the body of the for-loop, if false, exit for-loop
		// 3. either do the body (if condition is true), or exit
		// 4. update the count
		// 5. check condition 
		// repeat
	}

}
