package speedprog;

import java.util.Scanner;

public class CookieClicker {
	public static void main(String[] args) {
		
		//File fr = new File("C:\Users\AC\Downloads\B-small-practice.in");

		Scanner in = new Scanner(System.in);

	//	int testCases = in.nextInt();
		//for (int i = 1; i <= testCases; i++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			in.close();
			double rate = 2;
			int cookiecount = 0;
			double t = 0;
			while (cookiecount != X) {
				t++;
				// If you can buy a farm
				if (cookiecount >= C) {

					rate += F;
					cookiecount -= C;
				}

				// Increment on each second
				cookiecount += rate;
			}
			System.out.print(t);
		}

	}


