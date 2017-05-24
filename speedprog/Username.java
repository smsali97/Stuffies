package speedprog;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a name");

		String str = in.nextLine();
		System.out.println("Hello " + str + "!");
		in.close();
	}

}
