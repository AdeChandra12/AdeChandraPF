import java.util.Scanner;
public class Tugas3{public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
		System.out.print("Inputkan nilai huruf: ");
		char huruf = input.next().charAt(0);
		double nilaiIndeks;

		if (huruf == 'A') {
            nilaiIndeks = 4.0;
        } else if (huruf == 'B') {
            nilaiIndeks = 3.0;
        } else if (huruf == 'C') {
            nilaiIndeks = 2.0;
        } else if (huruf == 'D') {
            nilaiIndeks = 1.0;
        } else if (huruf == 'E') {
            nilaiIndeks = 0.0;
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui oleh sistem kami silahkan coba lagi.");
            return;
        }

        System.out.println("Hasil konversi: " + nilaiIndeks);
    }
}
