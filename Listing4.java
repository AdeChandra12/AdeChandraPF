import java.io.File;
import java.util.Scanner;

public class Listing4 {
    public static void main(String[] args) {
        File evidence = new File("cookedBooks.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;

        do {
            System.out.print("Delete evidence? (y/n) ");
            reply = keyboard.next().charAt(0);
        } while (reply != 'y' && reply != 'n');

        if (reply == 'y') {
            System.out.println("Okay, here goes...");
            if (evidence.delete()) {
                System.out.println("The evidence has been deleted.");
            } else {
                System.out.println("Failed to delete the evidence.");
            }
        } else {
            System.out.println("Sorry, buddy. Just asking.");
        }

        keyboard.close();
    }
}
