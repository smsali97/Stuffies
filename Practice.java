import java.util.Scanner;
/*
 * @param input
 * 
 * 
 */

public class Practice {
	public static void main(String[] args) {
		// First you will create a sample box
		 char[][] box = new char[3][3];
		//char[][] box = { { 'O', 'X', 'O' }, { 'X', 'X', 'O' }, { 'O', 'O', 'X' } };
        for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length; j++) {
				box[i][j] = ' ';
			}
		}
        Scanner in = new Scanner(System.in); 
		System.out.println("Insert row number then column number and then either an O or X with a space between each input");
        Practice.print(box);
		
		for (int i = 0; i < 1000; i++) {
            move(box, in.nextInt(), in.nextInt(), in.next());
			Practice.print(box);
		HCheck(box); VCheck(box); DCheck(box);
		if (Practice.isFull(box)) System.exit(0);
		}
      in.close();
	}

	public static void HCheck(char[][] box) {
		for (int i = 0; i < box.length; i++) {

			if (box[i][0] == 'O' && box[i][1] == 'O' && box[i][2] == 'O') {
				System.out.println("Player O wins!");
				System.exit(0);
			}
			if (box[i][0] == 'X' && box[i][1] == 'X' && box[i][2] == 'X') {

				System.out.println("Player X wins!");
				System.exit(0);}
		}

	}

	public static void VCheck(char[][] box) {
		for (int i = 0; i < box.length; i++) {

			if (box[0][i] == 'O' && box[1][i] == 'O' && box[2][i] == 'O') {
				System.out.println("Player who chose O wins! ");
				System.exit(0);
			}
			if (box[0][i] == 'X' && box[1][i] == 'X' && box[2][i] == 'X')
			{
				System.out.println("Player who chose X wins!");
				System.exit(0); }
			}

	}

	public static void DCheck(char[][] box) {
		// Box has O in the Centre
		if (box[1][1] == 'O') {
			if (box[0][0] == 'O' && box[2][2] == 'O') {
				System.out.println("Player O wins!");
				System.exit(0);
			} else if (box[2][0] == 'O' && box[0][2] == 'O') {
				System.out.println("Player O wins!");
				System.exit(0);
			}
		}

		if (box[1][1] == 'X') {
			if (box[0][0] == 'X' && box[2][2] == 'X') {
				System.out.println("Player X wins!");
				System.exit(0);
			} else if (box[2][0] == 'X' && box[0][2] == 'X') {
				System.out.println("Player X wins!");
				System.exit(0);
			}
		}

	}

	public static boolean isFull(char[][] box) {
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length; j++) {
				if (box[i][j] == ' ')
					return false;
			}
		}
		System.out.print("The game is drawn. Tch. Tch.");
		return true;
	}

	public static char[][] move(char[][] box, int row, int col, String Letter) {
		 char letter = Letter.charAt(0);
		if (letter == 'X' || letter == 'O')
			if (box[row-1][col-1] != ' ') System.out.println("Space is occupied");
			else box[row - 1][col - 1] = letter;
		else
			System.out.println("Invalid move");
		return box;
	}

    public static void print(char[][] box) {
    	System.out.println("    " + 1 + "  " + 2 + "  " + " " + 3);
    	for (int i = 0; i < box.length; i++) {   		
    		System.out.print( (i+1) + "  ");	
    		for (int j = 0; j < box.length; j++) {
				
				System.out.print(box[i][j] + " | ");
			}
			System.out.println();	
			}
    	
    }
}
