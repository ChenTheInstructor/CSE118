package p3_for_loop;

public class HiDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("hi");
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("i = " + i);
//			System.out.println();
		}
		System.out.println("Done");
	}

}
