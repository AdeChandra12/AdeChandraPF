import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Apa passwordnya? ");
        String password = keyboard.next();

        System.out.println("Anda mengetik >>" + password + "<<\n");

        if (password.equals("swordfish")) {
            System.out.println("Anda tampaknya seorang peretas (hacker).");
        } else {
            System.out.println("Itu tidak masalah besar.");
        }

        System.out.println();

        if (password.equals("swordfish")) {
            System.out.println("Anda dapat menggunakan sistem kami.");
        } else {
            System.out.println("Anda tidak dapat menggunakan sistem kami.");
        }

        keyboard.close();
    }
}
