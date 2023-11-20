import java.util.Random;
import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        int[] validPins = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000};
        Random random = new Random();
        int secretPin = validPins[random.nextInt(validPins.length)]; // Memilih PIN acak dari daftar validPins
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Selamat datang di permainan Tebak PIN 4 digit!");
        System.out.println("Silakan tebak PIN (4 digit) yang telah dibuat.");

        do {
            System.out.print("Masukkan tebakan Anda: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < 1000 || guess > 9000) {
                System.out.println("Tebakan harus berupa angka 4 digit (1000-9000)!");
            } else if (guess < secretPin) {
                System.out.println("Tebakan terlalu rendah.");
            } else if (guess > secretPin) {
                System.out.println("Tebakan terlalu tinggi.");
            }
        } while (guess != secretPin);

        System.out.println("Selamat! Anda berhasil menebak PIN " + secretPin + " dalam " + attempts + " percobaan.");
    }
}
