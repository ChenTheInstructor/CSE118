package p2;

public class Main {

	public static void main(String[] args) {
		showTable();
	}
	
	public static void showTable() {
//		double celsius = -40.0;
//		double fahrenheit = -120.0;
		
		String formatHeader = "%-15s%-15s%-15s%-15s%n";
		String formatBody = "%-15.1f%-15.1f%-15.1f%-15.2f%n";
		
		System.out.printf(formatHeader, "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		System.out.println("-------------------------------------------------------");
		
		for(double celsius = 40.0, fahrenheit = 120.0; (celsius >= 31 && fahrenheit >= 30.0); celsius -= 1.0, fahrenheit -= 10) {
			System.out.printf(formatBody, celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
		
//		while(celsius >= 31.0 && fahrenheit >= 30.0) {
//			System.out.printf(formatBody, celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
//			celsius -= 1.0;
//			fahrenheit -= 10.0;
//		}
		
//		do {
//			System.out.printf(formatBody, celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
//			celsius -= 1.0;
//			fahrenheit -= 10.0;
//		} while(celsius >= 31.0 && fahrenheit >= 30.0);
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
