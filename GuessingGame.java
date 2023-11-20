import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretPin = random.nextInt(10000); // Membuat PIN acak dari 0000 hingga 9999
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Selamat datang di permainan Tebak PIN 4 digit!");
        System.out.println("Silakan tebak PIN (4 digit) yang telah dibuat.");

        do {
            System.out.print("Masukkan tebakan Anda: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < 0 || guess > 9999) {
                System.out.println("Tebakan harus berupa angka 4 digit (0000-9999)!");
            } else if (guess < secretPin) {
                System.out.println("Tebakan terlalu rendah.");
            } else if (guess > secretPin) {
                System.out.println("Tebakan terlalu tinggi.");
            }
        } while (guess != secretPin);

        System.out.println("Selamat! Anda berhasil menebak PIN " + secretPin + " dalam " + attempts + " percobaan.");
    }
}
