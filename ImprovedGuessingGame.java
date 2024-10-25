import java.util.Scanner;
import java.util.Random;


public class ImprovedGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random(); // create random object.
        Scanner scanner = new Scanner(System.in);


        int randomNumber = rand.nextInt(100) + 1; // generate a random number within a range.


        System.out.println("Welcome to the Guessing Game! Try to guess my integer number between 1 & 100! You can quit at any time by typing \"quit\".");
        int attempts = 0;


        boolean guessed = false;
        while(!guessed) {
            attempts++;
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("You entered the number: " + number);
                if (number > randomNumber) System.out.println("Guess LOWER!");
                else if (number < randomNumber) System.out.println("Guess HIGHER!");
                else{
                    System.out.println("CONGRATULATIONS! The number is " + randomNumber);
                    System.out.println("You guessed it in " + attempts + " attempts");
                    guessed = true;
                }
            } else {
                String invalidInput = scanner.next(); // Consume the invalid input
                if(invalidInput.equalsIgnoreCase("quit")){
                    System.out.println("You quit the game!");
                    guessed = true;
                }
                else System.out.println("Error: '" + invalidInput + "' is not a valid number.");
            }
        }
    }
}
