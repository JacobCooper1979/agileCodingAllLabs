package itech2306.lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Declare an array of integers capable of storing up to 10 values integer values.
        int[] numbers = new int[10];
        // Step 10: Created a new array for the reversed order of numbers the user has entered.
        int[] reverse = new int[10]; 
        int count = 0; // Counter for tracking number of data entered by the user.
        int largest, userInput;
        
        // Initialising the scanner that has been imported from the java.util.Scanner.
        Scanner scan = new Scanner(System.in);

        // Step 1-4: Read user input (up to 10 numbers and than ends the loop if 10 numbers have been entered into the array and the array is full)
        System.out.println("Enter up to 10 numbers (type 'end' to stop early):");
        while (count < numbers.length) {
            String input = scan.next();
            // Stop input when the word "end" is entered which allows the user to only enter in as many numbers as they want until the numbers reach 10.
            if (input.equalsIgnoreCase("end")) break; 
            try {
                numbers[count] = Integer.parseInt(input);
                count++; // Increment counter
            } catch (NumberFormatException e) {
            	// this ensures that the program still runs even if the user enters in the wrong word to end the program.
                System.out.println("Invalid input! Please enter a valid number or 'end' to stop.");
            }
        }

        // Step 5: Displaying the numbers that have been entered by the user utilising a while-loop.
        System.out.print("You entered: ");
        int i = 0;
        while (i < count) {
        	// prints out each number
            System.out.print(numbers[i] + " ");
            // increases variable i by 1 to ensure that the loop doesnt turn into an endless loop.
            i++;
        }
        System.out.println();

        // Step 7: Requesting the user to enter in the threshold number they would like to use which can be any integer they want it to be.
        System.out.print("Enter a threshold number: ");
        userInput = scan.nextInt();

        // Step 7: Display numbers that are greater (≤) than the user input using do-while loop
        System.out.print("Numbers < " + userInput + ": ");
        // creating the i variable and setting it to 0.
        i = 0;
        do {
            if (i < count && numbers[i] >= userInput) {
                System.out.print(numbers[i] + " ");
            }
            // ensuring that the do while loop doesnt turn into an endless loop 
            //by adding 1 to the variable i every time the do-while doesnt turn into an endless loop.
            i++;
        } while (i < count);
        System.out.println();

        // Step 8: this loop ensures that the largest numbers is found first and displayed to the user by storing them in the reverse Array.
        largest = numbers[0];
        for (i = 1; i < count; i++) {
            if (numbers[i] < largest) {
                largest = numbers[i];
            }
        }
        // prints out the largest number is
        System.out.println("Largest number: " + largest);

        // Step 10-11: this for loop loops through the numbers and stores them in reverse order in the reverse array.
        for (i = 0; i < count; i++) {
            reverse[count - 1 - i] = numbers[i];
        }

        // Step 12: Using a while loop to display the reversed numbers.
        System.out.print("Reversed: ");
        i = 0;
        while (i < count) {
            System.out.print(reverse[i] + " ");
            i++;
        }
        System.out.println();

        scan.close();
    }
}
