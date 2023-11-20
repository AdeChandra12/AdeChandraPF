import java.util.Scanner;
import java.util.Random;

public class Listing6-1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numGuesses = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        System.out.println("************");
        System.out.println("Welcome to the Guessing Game");
        System.out.println("************\n");

        while (true) {
            System.out.print("Enter an integer from 1 to 10: ");
            int inputNumber = keyboard.nextInt();
            numGuesses++;

            if (inputNumber == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number after " + numGuesses + " guesses.");
                break;
            } else {
                System.out.println("Try again...");
            }
        }

        keyboard.close();
    }
}
