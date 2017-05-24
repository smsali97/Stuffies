import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		
		
	
		Scanner in = new Scanner(System.in);
		
		int lines = in.nextInt();
		int num = 1;
		/* 
		 * 1 
		 * 2 3 
		 * 4 5 6 
		 * 7 8 9 10
		 *
		 */
		for (int i = 0; i <= lines; i++) {
			for (int j = 0; j <= lines; j++) {
				if (i > j) {
					System.out.print(num + " ");
					num++;
				}

			}
			System.out.println();
		}
in.close();
	}
}
