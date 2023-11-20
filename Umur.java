import java.util.Calendar;
import java.util.Scanner;

public class Umur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun kelahiran Anda: ");
        
		int tahunKelahiran = input.nextInt();
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunKelahiran;
			System.out.println("Umur Anda adalah: " + umur + " tahun");
        input.close();
    }
}
