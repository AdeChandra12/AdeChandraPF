import java.util.Scanner;

public class Tebakan{
    public static void main(String[] args) {
        // Tentukan PIN 4 digit di dalam source code
        int pin = 1234;
        int maksPercobaan = 3;
        int percobaan = 0;

        Scanner scanner = new Scanner(System.in);

        while (percobaan < maksPercobaan) {
            System.out.print("Masukkan PIN (4 digit): ");
            int tebakan = scanner.nextInt();
            
            if (tebakan == pin) {
                System.out.println("Selamat! Anda berhasil memasukkan PIN dengan benar.");
                break;
            } else {
                percobaan++;
                System.out.println("PIN salah. Anda memiliki " + (maksPercobaan - percobaan) + " kesempatan tersisa.");
            }
        }

        if (percobaan == maksPercobaan) {
            System.out.println("Maaf, Anda telah melebihi jumlah maksimal percobaan. PIN Anda diblokir.");
        }

        scanner.close();
    }
}
