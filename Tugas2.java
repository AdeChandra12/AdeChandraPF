public class Tugas2{
    public static void main(String[] args) {
		int sksPF = 4;
        int sksSistemDigital = 2;
		int sksKalkulus = 3;
        double nilaiIndexPF = 3.5;
        double nilaiIndexKalkulus = 4.0;
        double nilaiIndexSisDig = 2.75;

        // Menghitung total index
        double totalIndex = (sksPF * nilaiIndexPF) + (sksKalkulus * nilaiIndexKalkulus) + (sksSistemDigital * nilaiIndexSisDig);

        // Menghitung total SKS
        int totalSks = sksKalkulus + sksPF + sksSistemDigital;

        // Menghitung IP
        double ip = totalIndex / totalSks;

        // Menampilkan hasil IP
        System.out.println("IP Anda adalah: " + ip);
    }
}