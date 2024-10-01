package p0;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Ask the user for their GPA
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        // Add 0.5 to the GPA
        double revisedGpa = gpa + 0.5;
        
        // Display the name and revised GPA
        System.out.println("Name: " + name);
        System.out.println("Revised GPA: " + revisedGpa);
        
        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
