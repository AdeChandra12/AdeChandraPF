public class JPanel {
    public static void main(String[] args) {
        int height = 7; // Tinggi batang bunga

        // Gambar batang bunga
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Gambar daun bunga
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }

        // Gambar kelopak bunga
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
