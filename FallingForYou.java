import static java.lang.System.out;
import java.util.Scanner;
public class FallingForYou {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Which verse? ");
		int verse = keyboard.nextInt();
		switch (verse) {
		case 3:
			System.out.print("Last refrain, ");
			System.out.println("last refrain,");
		case 2:
			System.out.print("He's a pain, ");
			System.out.println("he's a pain,");
		case 1:
			System.out.print("Has no brain, ");
			System.out.println("has no brain,");
		}
			System.out.println("In the rain, in the rain.");
			System.out.println("Ohhhhhhhh...");
			System.out.println();
			
			keyboard.close();
	}
}