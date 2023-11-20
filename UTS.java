import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah data: ");

        int jumlahData = scanner.nextInt();
        int[] data = new int[jumlahData];
        System.out.println("\nInput data =");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke " + i + ": ");
            data[i] = scanner.nextInt();

            if (data[i] % 2 == 0) {
                System.out.println(data[i] + " GENAP");
            } else {
                System.out.println(data[i] + " GANJIL");
            }
        }
        int total = 0;
        for (int i = 0; i < jumlahData; i++) {
            total += data[i];
        }
        double rataRata = (double) total / jumlahData;
        System.out.println("\nTOTAL PENJUMLAHAN: " + total);
        System.out.println("RATA-RATA: " + (int) rataRata);
    }
}
