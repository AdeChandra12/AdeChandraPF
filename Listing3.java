public class Listing3 {
    public static void main(String[] args) {
        for (int verse = 1; verse <= 3; verse++) {
            System.out.print("Al's all wet. ");
            System.out.println("Oh, why is Al all wet? Oh,");
            System.out.print("Al's all wet 'cause ");
            System.out.println("he's standing in the rain.");
            System.out.println("Why is Al out in the rain?");

            switch (verse) {
                case 1:
                    System.out.println("That's because he has no brain.");
                    break;
                case 2:
                    System.out.println("That's because he is a pain.");
                    break;
                case 3:
                    System.out.println("'Cause this is the last refrain.");
                    break;
            }

            switch (verse) {
                case 3:
                    System.out.println("Last refrain, last refrain,");
                case 2:
                    System.out.println("He's a pain, he's a pain,");
                case 1:
                    System.out.println("Has no brain, has no brain,");
            }

            System.out.println("In the rain, in the rain.");
            System.out.println("Ohhhhhhhh...\n");
        }

        System.out.print("Al's all wet. ");
        System.out.println("Oh, why is Al all wet? Oh,");
        System.out.print("Al's all wet 'cause ");
        System.out.println("he's standing in the rain.");
    }
}
