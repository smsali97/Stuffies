import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Tidy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		// test cases
		for (int i = 0, T = in.nextInt(); i < T; i++) {
			BigInteger N = in.nextBigInteger();
			int lastnum = 0;
			
			for (BigInteger j = N; j.compareTo(N) <= 0; j = j.subtract(BigInteger.ONE)) {
				String word = "" + j;
				char[] digits = word.toCharArray();
				boolean flag = true;
				
				int d1 = Character.getNumericValue(digits[0]);
				for (int k = 1; k < digits.length && flag; k++) {

					int d2 = Character.getNumericValue(digits[k]);
					if (d1 > d2) {
						flag = false;
					}
					d1 = d2;
				}
				if (flag) {
					lastnum = Integer.parseInt(word);
					break;
				}
			}
			System.out.println("Case #" + (i+1) + ": " + lastnum);
		}
		in.close();
	}

}
