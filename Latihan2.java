import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan modal
        System.out.print("Masukkan modal: ");
        double modal = input.nextDouble();

        // Meminta pengguna memasukkan persentase keuntungan
        System.out.print("Masukkan persentase keuntungan: ");
        double persentaseKeuntungan = input.nextDouble();

        // Menghitung profit
        double keuntungan = modal * (persentaseKeuntungan / 100);
        double profit = modal + keuntungan;

        // Menampilkan hasil
        System.out.println("Keuntungan: " + keuntungan);
        System.out.println("Profit: " + profit);

        input.close();
    }
}
