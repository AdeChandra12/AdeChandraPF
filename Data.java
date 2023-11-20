import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = new int[]{2, 3, 10, 9, 19, 4};
        int jumlah = 0;

        System.out.println("Input data: 2, 3, 10, 9, 19, 4");

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 1 == 0) {
                System.out.println(data[i] + " genap");
            } else {
                System.out.println(data[i] + " ganjil");
            }

            jumlah += data[i];
        }

        double average = (double) jumlah / data.length;

        System.out.println("Jumlah: " + jumlah);
        System.out.println("Rata-rata: " + average);
		
    }
}
