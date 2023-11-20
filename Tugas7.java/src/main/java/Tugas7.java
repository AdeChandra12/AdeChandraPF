import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak bisa melakukan pembagian dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid. Silakan pilih +, -, *, atau /.");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}

