import static java.lang.System.out;
import java.util.Scanner;
public class SwitchIt7 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Which verse (one, two or three)? ");
		String verse = keyboard.next();
		
		switch (verse) {
		case "one":
			System.out.println("That's because he has no brain.");
		break;
		case "two":
			System.out.println("That's because he is a pain.");
		break;
		case "three":
			System.out.println("'Cause this is the last refrain.");
		break;
		default:
				System.out.println("No such verse. Please try again.");
		break;
		}
			System.out.println("Ohhhhhhhh. . . .");
			keyboard.close();
	}
}