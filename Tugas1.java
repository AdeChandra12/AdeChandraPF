
public class Tugas1{
    public static void main(String[] args) {
        int[] angka = {50,60, 70, 80, 90, 100};
        int jumlah = 0;
        double rataRata = 0.0;

        // Menghitung jumlah
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        // Menghitung rata-rata
        rataRata = (double) jumlah / angka.length;

        // Menampilkan hasil perhitungan
        System.out.println("Angka: " + angka[0] + ", " + angka[1] + ", " + angka[2] + ", " + angka[3] + ", " + angka[4] + "," + angka[5]);
        System.out.println("Jumlah angka: " + jumlah);
        System.out.println("Rata-rata angka: " + rataRata);
    }
}