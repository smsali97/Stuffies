package speedprog;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Rand = (int) (Math.random() * 10 + 1);
		System.out.println("Im thinking of a number between one and ten! Can you guess it?");

		Scanner in = new Scanner(System.in);
		boolean flag = false;
		while (!flag) {
			int num = in.nextInt();
			if (num == Rand)
				flag = true;
			else if (num > Rand) {
				System.out.println("Number you chose is greater");
			} else
				System.out.println("Number you chose is less");

		}
		in.close();
		System.out.println("You guessed correctly! I was thinking of " + Rand);
	}

}
