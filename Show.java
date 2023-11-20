import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Show {
	public static void main(String args[])
		throws IOException {
			
		int guests[] = new int[10];
			Scanner diskScanner =
			new Scanner(new File("GuestList.txt"));
		for(int roomNum = 0; roomNum < 10; roomNum++) {
			guests[roomNum] = diskScanner.nextInt();
		}
		System.out.println("Room\tGuests");
			for(int roomNum = 0; roomNum < 10; roomNum++) {
			System.out.print(roomNum);
			System.out.print("\t");
			System.out.println(guests[roomNum]);
		}
		diskScanner.close();
	}
}