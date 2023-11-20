import static java.lang.System.out;
import java.util.Scanner;
public class Authenticator2 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Username: ");
		String username = keyboard.next();
		
		if (username.equals("Ade")) {
			System.out.print("Password: ");
			String password = keyboard.next();
			if (password.equals("Pria Kulbet")) {
				System.out.println("You're in.");
			} else {
				System.out.println("Abang Ganteng Ga Dek");
			}
		} else {
			System.out.println("Unknown user");
		}
		keyboard.close();
	}
}