public class Kuis {
    public static void main(String[] args) {
     
        int[] data = {30, 40, 51, 50, 60};
        
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }

        double average = (double) total / data.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + average);
    }
}