import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang belanja: ");
        int jumlahBarang = scanner.nextInt();

        int[] hargaBarang = {2500, 3000, 4000, 5000, 6000};
        int[] jumlahItem = new int[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Jumlah belanja item-" + (i + 1) + " Rp " + hargaBarang[i] + ": ");
            jumlahItem[i] = scanner.nextInt();
        }
        System.out.println("\nDaftar belanja dan harga:");

        int totalBelanja = 0;
        int totalItemBelanja = 0;

        for (int i = 0; i < jumlahBarang; i++) {
            int totalHarga = hargaBarang[i] * jumlahItem[i];
            System.out.println("Harga barang ke-" + (i + 1) + ", " + hargaBarang[i] + ", " + jumlahItem[i] + " item: " + totalHarga);
            totalBelanja += totalHarga;
            totalItemBelanja += jumlahItem[i];
        }
        System.out.println("\nTOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("TOTAL BELANJA: RP " + totalBelanja);
    }
}
