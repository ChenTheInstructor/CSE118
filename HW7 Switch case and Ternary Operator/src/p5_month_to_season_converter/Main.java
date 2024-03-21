package p5_month_to_season_converter;

public class Main {

	public static void main(String[] args) {
		int num = 3;

		String message = switch (num) {
		case 12, 1, 2 -> "Winter";
		case 3, 4, 5 -> "Spring";
		case 6, 7, 8 -> "Summer";
		case 9, 10, 11 -> "Fall";
		default -> "Unexpected input.";
		};
		System.out.println("The season is: " + message);
	}

}
