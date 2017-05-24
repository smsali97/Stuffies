package speedprog;

import java.util.ArrayList;
import java.util.Scanner;

public class Border {

	public static void main(String[] args) {
		/********
		 * Hello* my * name *
		 *******/

		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		int max = 1;
		while (in.hasNext()) {
			list.add(in.next());
		}

		String[] arry = list.toArray(new String[list.size()]);

		for (int i = 0; i < arry.length; i++) {
			if (arry[i].length() > max)
				max = arry[i].length();
		}

		for (int j = 0; j < max + 2; j++) {
			for (int i = 0; i < max + 2; i++) {

				if (j != 0 && j != max + 2) {
					if (arry[j - 1].length() == max)
						System.out.print("*" + arry[j - 1] + "*");
					else {
						int diff = arry.length - arry[j - 1].length();
						System.out.print("*" + arry[j - 1]);
						while (diff != 1) {
							System.out.print(" ");
							diff--;
						}
						System.out.print("*");
					}

				} else
					System.out.print("*");
			}
			System.out.println();
		}

		in.close();
	}
}
