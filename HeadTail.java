

import java.util.Scanner;

public class HeadTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String number = Binary2.convert(in.nextLong());
		
	char[][] array = new char[3][3];
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			if (number.startsWith("0")) array[j][i]='T';
			else if (number.startsWith("1")) array[j][i]='H';
			System.out.print(String.valueOf(array[i]) + " ");
		}
		System.out.println();

		}

		in.close();	

	}
	
	

}
