
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		try {
			File f = new File("testCount1tiny.txt");

			Scanner in = new Scanner(f);

			int distinctval = 1;
			int x = in.nextInt();

			while (in.hasNextInt()) {
				int y = in.nextInt();

				if (y != x)
					distinctval++;
				int temp = y;
				y = x;
				x = temp;
			}

			System.out.println("The number of distinct values are: " + distinctval);

			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
