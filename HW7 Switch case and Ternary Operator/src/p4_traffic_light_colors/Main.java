package p4_traffic_light_colors;

public class Main {

	public static void main(String[] args) {
		String color = "blue";

		String message = switch (color) {
		case "red" -> "Stop";
		case "green" -> "Go";
		case "yellow" -> "Caution";
		default -> "Unexpected input.";
		};
		System.out.println("The message is: " + message);
	}

}
