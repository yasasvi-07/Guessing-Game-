import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the number of guesses
        int numberOfGuesses = 0;

        // Start the game loop
        while (true) {
            // Prompt the user to enter a guess
            System.out.println("Enter a guess: ");

            // Read the user's guess
            int guess = scanner.nextInt();

            // Increment the number of guesses
            numberOfGuesses++;

            // Check if the guess is correct
            if (guess == randomNumber) {
                System.out.println("You guessed correctly! It took you " + numberOfGuesses + " guesses.");
                break;
            }

            // Give the user feedback on their guess
            else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
