// Import the Scanner class to read user input
import java.util.Scanner;

// Define a class named "test"
public class test {

	// Main method where program execution begins
	public static void main(String[] args) {

		// Create a Scanner object to read input from the console
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter their first name
		System.out.print("Please Enter your First Name: ");

		// Read the first name entered by the user
		String f_name = input.next();

		// Print a blank line for spacing
		System.out.println("");

		// Prompt the user to enter their last name
		System.out.print("Please Enter your Last Name: ");

		// Read the last name entered by the user
		String l_name = input.next();

		// Print a blank line for spacing
		System.out.println("");

		// Prompt the user to enter their year of birth
		System.out.print("Please Enter your year of Birth: ");

		// Read the year of birth entered by the user as an integer
		int b_year = input.nextInt();

		// Print a blank line for spacing
		System.out.println("");

		// Prompt the user to enter their height
		System.out.print("Please Enter your height: ");

		// Read the height entered by the user as a double
		double height = input.nextDouble();

		// Print a blank line for spacing
		System.out.println("");

		// Calculate and print the initials of the user
		System.out.println("Initials: " + f_name.substring(0, 1) + l_name.substring(0, 1));

		// Print the full name of the user
		System.out.println("Full Name: " + f_name + " " + l_name);

		// Print the height of the user (intended to use height variable, but currently using first name)
		System.out.println("Height: " + f_name);  // Note: This line should likely be corrected to use the "height" variable
	}
}