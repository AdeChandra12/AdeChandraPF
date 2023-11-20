public class Nadhif {
    public static void main(String[] args) {
        String[] lyrics = {
                "Karena bersamamu semua terasa indah",
                "Gundah gulana hatiku t'lah hancur sirna",
                "Janjiku tak akan kulepas wahai kau bidadariku dari surga",
                "Tuk s'lamanya",
                "Tuk s'lamanya",
                "Tuk s'lamanya"
        };

        // Loop through the lyrics and add a pause between each line.
        for (int i = 0; i < lyrics.length; i++) {
            System.out.println(lyrics[i]);

            // Add a pause between lines, except for the last line.
            if (i < lyrics.length - 1) {
                try {
                    Thread.sleep(1000); // Pause for 1 second (1000 milliseconds).
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
