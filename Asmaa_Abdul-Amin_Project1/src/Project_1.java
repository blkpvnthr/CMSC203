/*
 * Class: CMSC203 
 * Instructor:Ashique Tanveer
 * Description: A color guessing game.
 * Due: 02/02/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: _Asmaa Abdul-Amin_
*/

import java.util.Random;
import java.util.Scanner;

public class Project_1 {
    // Constants for color names
    final String COLOR_RED = "Red";
    final String COLOR_GREEN = "Green";
    final String COLOR_BLUE = "Blue";
    final String COLOR_ORANGE = "Orange";
    final String COLOR_YELLOW = "Yellow";

    public static void main(String[] args) {
        Project_1 espTest = new Project_1();
        espTest.runESPTest();
    }

    public void runESPTest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get student information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();

        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();

        // Display assignment details
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        int correctGuesses = 0;

        for (int round = 1; round <= 11; round++) {
            System.out.println("\nRound " + round);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");

            // Generate a random number between 0 and 4
            int randomNumber = random.nextInt(5);
            String selectedColor = getColorName(randomNumber);

            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine();

            // Validate user input
            while (!isValidColor(userGuess)) {
                System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
                System.out.print("Enter your guess again: ");
                userGuess = scanner.nextLine();
            }

            if (userGuess.equalsIgnoreCase(selectedColor)) {
                System.out.println("I was thinking of " + selectedColor + ".");
                correctGuesses++;
            } else {
                System.out.println("I was thinking of " + selectedColor + ".");
            }
        }

        System.out.println("\nGame Over\n");
        System.out.println("You guessed " + correctGuesses + " out of 11 colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);

        // Close the scanner
        scanner.close();
    }

    private String getColorName(int number) {
        switch (number) {
            case 0:
                return COLOR_RED;
            case 1:
                return COLOR_GREEN;
            case 2:
                return COLOR_BLUE;
            case 3:
                return COLOR_ORANGE;
            case 4:
                return COLOR_YELLOW;
            default:
                return "Unknown";
        }
    }

    private boolean isValidColor(String color) {
        return color.equalsIgnoreCase(COLOR_RED) || color.equalsIgnoreCase(COLOR_GREEN)
                || color.equalsIgnoreCase(COLOR_BLUE) || color.equalsIgnoreCase(COLOR_ORANGE)
                || color.equalsIgnoreCase(COLOR_YELLOW);
    }
}
