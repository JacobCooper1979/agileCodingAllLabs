/**
 * 
 */
package itech2306.lab2; // Package declaration must be at the top

import java.util.Scanner; // Import Scanner for user input

/**
 * 
 */
public class Task2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Step 1: Defining an array for the names of each day in a week (Monday to Sunday)
        String[] dayNames = { "Monday", "Tuesday", "Wednesday",
                              "Thursday", "Friday", "Saturday", "Sunday" };

        // Step 2: Defining an array for the months of the year with "Invalid" at index 0
        // The array size should be 13 to allow 13 entries (1-based index)
        String[] monthNames = new String[13];
        monthNames[0] = "Invalid";
        monthNames[1] = "January";
        monthNames[2] = "February";
        monthNames[3] = "March";
        monthNames[4] = "April";
        monthNames[5] = "May";
        monthNames[6] = "June";
        monthNames[7] = "July";
        monthNames[8] = "August";
        monthNames[9] = "September";
        monthNames[10] = "October";
        monthNames[11] = "November";
        monthNames[12] = "December";

        // Step 3: Creating a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Step 4: Initialise selection and other integer variables
        int selection = 1; // Keeps track of whether to continue or exit
        int week, month, day; // Variables to store user choices

        // Step 5: Starting a do-while loop that continues until selection is set to 0
        do {
            // Step 6: Ask for week number (1-4) and ensures a valid input is required or loops again to ensure that a valid input is entered.
            do {
                System.out.print("Enter a week number (1-5): ");
                week = scanner.nextInt();
                if (week < 1 || week > 5) {
                    // Error handling to ensure that the user inputs the correct number so the program does not crash.
                    System.out.println("That is not a valid input. Please enter a number between 1 and 5.");
                }
            } while (week < 1 || week > 5);

            // Step 7: Ask for day-of-week selection (1-7) and ensures a valid input is required or loops again to ensure that a valid input is entered.
            do {
                System.out.print("Enter a day number (1-7): ");
                day = scanner.nextInt();
                if (day < 1 || day > 7) {
                    // Error handling to ensure that the user inputs the correct number so the program does not crash.
                    System.out.println("That is not a valid input. Please enter a number between 1 and 7.");
                }
            } while (day < 1 || day > 7);

            // Step 8: Ask for month selection (1-12) and validate input
            do {
                System.out.print("Enter a month number (1-12): ");
                month = scanner.nextInt();
                if (month < 1 || month > 12) {
                    // Error handling to ensure that the user inputs the correct number so the program does not crash.
                    System.out.println("That is not a valid input. Please enter a number between 1 and 12.");
                }
            } while (month < 1 || month > 12);

            // Step 9: Converting the users entered week number to proper suffix (1st, 2nd, 3rd, 4th).
            String weekSuffix;
            switch (week) {
                case 1: weekSuffix = "1st"; break;
                case 2: weekSuffix = "2nd"; break;
                case 3: weekSuffix = "3rd"; break;
                case 4: weekSuffix = "4th"; break;
                case 5: weekSuffix = "5th"; break;
                default: weekSuffix = ""; // as required the program is not allowed to get to week 5 as their are no months that have 5 weeks.
            }

            // Print the formatted result
            System.out.println(monthNames[month] + " " + weekSuffix +  dayNames[day - 1] );

            // Step 10: Ask user if they want to continue or exit, accepting "y", "yes", "n", "no" to make it easier for the user.
            String userInput;
            do {
                System.out.print("Do you want to enter another date? (y/n): ");
                userInput = scanner.next().trim().toLowerCase();

                if (userInput.equals("y") || userInput.equals("yes")) {
                    selection = 1;
                    break;
                } else if (userInput.equals("n") || userInput.equals("no")) {
                    selection = 0;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'y' for yes or 'n' for no.");
                }
            } while (true); // Keep asking until the user enters in a valid input.

        } while (selection != 0); // Step 5: Continue loop until selection is set to 0.

        // Step 11: Confirm the program is ending and displays a message to the user.
        System.out.println("Program terminated. Have a wonderful day!");

        scanner.close(); 
    }
}
