
package java1trafficlight;

import java.util.Scanner;

/**
 *
 * @author jhane
 */
public class Java1TrafficLight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create a scanner object to read user input.
    Scanner scanner = new Scanner(System.in);
    
    String input = "";
    String continueInput = "";

    // A boolean flag to control the main loop.
    boolean continueProgram = true;

    /**
     * Main loop. It will continue running as long as `continueProgram` is true.
     * This allows the user to repeat the program or exit it.
     */
    while (continueProgram) {

        // Prompting the user to input a traffic light color.
        System.out.println("Enter a traffic light color (red, yellow, green): ");

        // Read the user input as a string and store it in `input`.
        input = scanner.nextLine().toLowerCase();  // Convert input to lowercase for case insensitivity

        /**
         * Validate that the user input contains only letters.
         * The `matches` method uses a regular expression to check if the input
         * contains only alphabetic characters (a-z or A-Z).
         */
        if (input.matches("[a-zA-Z]+")) {

            /**
             * Switch statement to handle different traffic light colors.
             * It compares the `input` string and executes the corresponding case block.
             */
            switch (input) {
                case "red":
                    // If the input is "red", this message is displayed.
                    System.out.println("STOP! The light is RED.");
                    break;
                case "yellow":
                    // If the input is "yellow", this message is displayed.
                    System.out.println("CAUTION! The light is YELLOW.");
                    break;
                case "green":
                    // If the input is "green", this message is displayed.
                    System.out.println("GO! The light is GREEN.");
                    break;
                default:
                    // If the input does not match "red", "yellow", or "green", this message is displayed.
                    System.out.println("Invalid traffic light color. Please enter red, yellow, or green.");
                    break;
            }
        } else {
            // If the input contains non-alphabetic characters, this message is displayed.
            System.out.println("Invalid input. Please enter only letters.");
        }

        /**
         * Ask the user if they want to continue or exit the program.
         * This will repeat the process if the user enters "yes", or terminate if they enter "no".
         */
        System.out.println("Do you want to continue? (yes or no): ");
        continueInput = scanner.nextLine().toLowerCase();

        /**
         * Validate if the user wants to exit the program.
         * If the user types "no", the `continueProgram` flag is set to false, which will end the loop.
         */
        if (continueInput.equals("no")) {
            continueProgram = false;  // Exit the loop
        }
    }

    // Closing the scanner as it's no longer needed.
    scanner.close();

    // Print a final message when the program exits.
    System.out.println("Program is over.");
}

    
}
