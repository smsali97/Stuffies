package speedprog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Magician {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String report = null;

		File file = new File("E:\\small.out");
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < T; i++) {
			report += "Case #" + (i + 1) + ": " + result() + "\n";
		}

		writer.write(report);
		writer.close();
		in.close();

	}

	public static String result() {

		Scanner in = new Scanner(System.in);
		int row1 = in.nextInt();

		int[][] cardset1 = new int[4][4];

		for (int i = 0; i < cardset1.length; i++) {
			for (int j = 0; j < cardset1.length; j++) {
				cardset1[i][j] = in.nextInt();
			}
		}
		int row2 = in.nextInt();

		int[][] cardset2 = new int[4][4];

		for (int i = 0; i < cardset2.length; i++) {
			for (int j = 0; j < cardset2.length; j++) {
				cardset2[i][j] = in.nextInt();
			}
		}
		in.close();
		int count = 0;
		int number = 0;
		for (int i = 0; i < cardset2.length; i++) {
			int x = cardset1[row1 - 1][i];
			for (int j = 0; j < cardset2.length; j++) {

				if (x == cardset2[row2 - 1][j]) {
					number = cardset1[row1 - 1][i];
					count++;
				}
			}
		}
		String result = "";
		switch (count) {
		case 0:
			result = "Volunteer cheated!";
			break;
		case 1:
			result = "" + number;
			break;
		default:
			result = "Bad magician!";
			break;
		}
		return result;
	}

}
