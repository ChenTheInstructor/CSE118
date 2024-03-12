package sort_3_numbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three whole numbers: ");
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int max;
		int min;
		int mid;
		
		
		if(n1 >= n2 && n1 >= n3) {
			max = n1;
			if(n2 >= n3) {
				mid = n2;
				min = n3;
			} else {
				mid = n3;
				min = n2;
			}
		} else if (n2 >= n1 && n2 >= n3){
			max = n2;
			if(n1 >= n3) {
				mid = n1;
				min = n3;
			} else {
				mid = n3;
				min = n1;
			}
		} else {
			max = n3;
			if(n1 >= n2) {
				mid = n1;
				min = n2;
			} else {
				mid = n2;
				min = n1;
			}
		}
		
		System.out.println(min + " " + mid + " " + max);
	}

}
