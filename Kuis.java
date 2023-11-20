import java.util.Scanner;
public class Kuis {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double modal = 20; // Modal sebesar 20
        double persentaseKeuntungan = 5; // Persentase keuntungan sebesar 5
		
		System.out.println("Masukkan Persentase Keuntungan");
        double keuntungan = modal * (persentaseKeuntungan / 100);
        double profit = modal + keuntungan;

        System.out.println("Modal: " + modal);
        System.out.println("Persentase Keuntungan: " + persentaseKeuntungan + "%");
        System.out.println("Keuntungan: " + keuntungan);
        System.out.println("Profit: " + profit);
    }
}
