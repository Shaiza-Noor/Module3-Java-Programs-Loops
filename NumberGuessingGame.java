import java.util.Scanner; // Importing the Scanner class for taking user input from the keyboard
import java.util.Random; // Importing the Random class
// Declaring the public class named NumberGuessingGame
public class NumberGuessingGame {
    //  program execution starts from here
    public static void main(String[] args) {
        // Creating a Scanner object named 'input' to read user input
        Scanner input = new Scanner(System.in);
        // Creating a Random object named 'random' 
        Random random = new Random();
        // Setting the secret number manually to 47 (you can make this random if you want)
         int guessnumber= 47; // Random number between 1 and 100
          // Variable to store user's guess
        int guess;
        // Variable to count how many attempts the player takes
        int attempts = 0;

        System.out.println("Welcome to Shaiza  Number Guessing Game!");// Displaying the welcome message
        System.out.println("I'm thinking of a number between 1 and 100...");// Inform the player about the number range

// do-while loop
        do {

            System.out.print(" Enter your guess: ");// Asking the player to enter a guess
            guess = input.nextInt();// Reading the user's input and storing it in 'guess
            attempts++;// Increasing the number of attempts by 1 each time
// if-else-if Statement
            if (guess < guessnumber) {
                System.out.println("⬇ Too LOW! Try a higher number.\n");
            } else if (guess > guessnumber) {
                System.out.println("⬆ Too HIGH! Try a lower number.\n");
            } else {
                System.out.println(" Congratulations, Shaiza! You guessed it right!");
                System.out.println("The secret number was: " + guessnumber);
                System.out.println("You took " + attempts + " attempts to guess correctly! ");
            }
        } while (guess != guessnumber);// Continue looping until the guessed number matches the secret number

        input.close();
    }
}
