

    
package speedprog;

public class Sudoku {

	public static void main(String[] args) {
		

		// Generate the given matrix
		int[][] matrix = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0, n = (i * 3 + i / 3); j < 9; j++, n++) {
				matrix[i][j] = (n % 9) + 1;
				System.out.print(matrix[i][j] + " ");
				if ((j+1)%3==0) System.out.print("| ");
			}
			System.out.println();
			if ((i+1)%3==0) {
				for(int l=0; l < 9; l++) {
			
				if (l==8) System.out.println();
				else System.out.print("---"); }
			}
			
		}
		
		//or Generate your own!
/*  int[][] puzzle = { {5,3,4,6,7,8,9,1,2},
		           {6,7,2,1,9,5,3,4,8},
		           {1,9,8,3,4,2,5,6,7},
		           {8,5,9,7,6,1,4,2,3},
		           {4,2,6,8,5,3,7,9,1},
		           {7,1,3,9,2,4,8,5,6},
		           {9,6,1,5,3,7,2,8,4},
		           {2,8,7,4,1,9,6,3,5},
		           {3,4,5,2,8,6,1,7,9}}; */

		if (Sudoku.isValid(matrix))
			System.out.println("Your puzzle is correct!");
		else
			System.out.println("Your puzzle is incorrect!");

	}

	public static boolean isValid(int[][] matrix) {

		// Horizontal check
		boolean hcheck = false;
		int hsum = 0;
		for (int i = 0; i < matrix.length; i++) {
			hsum = 0;
			for (int j = 0; j < matrix.length; j++) {
				hsum += matrix[j][0 + i];
			} 
			if (hsum == 45)
				hcheck = true;
			else { hcheck = false; break; }
		}
		
		

		// Vertical check
		int vsum = 0;
		boolean vcheck = false;
		for (int i = 0; i < matrix.length; i++) {
			vsum = 0;
			for (int j = 0; j < matrix.length; j++) {
				vsum += matrix[i][j];
			} 
			if (vsum == 45)
				vcheck = true;
			else { vcheck = false; break; }
		}
		

		// Box Horizontal Check
		boolean bhcheck = false;

		for (int m = 0; m < 3; m++) {		
			for (int k = 0; k < 3; k++) {
				int bhsum = 0;
				for (int j = 0; j < 3; j++) {
					for (int i = 0; i < 3; i++) {
						bhsum += matrix[i + (3 * k)][j + (3*m)];
					}

					if (bhsum == 45)
						bhcheck = true;
					else {
						bhcheck = false; }

				}
			} 
		}
		// Box Vertical Check
		boolean bvcheck = false;
		for (int z = 0; z < 3; z++) {
			for (int k = 0; k < 3; k++) {
				int bvsum = 0;
				for (int j = 0; j < 3; j++) {
					for (int i = 0; i < 3; i++) {
						bvsum += matrix[i + (3*z)][j + (3 * k)];
					}

					if (bvsum == 45)
						bvcheck = true;
					else {
						bvcheck = false; 
					}
						
				}
			} 
		}
		//Sum of each box 
		int totalsum = 0;
		boolean sumeach = false;
		for (int j =0; j <9; j++)
		{
			for (int i=0; i < 9; i++)
			{
				totalsum += matrix[i][j];	
			}
		}
		if (totalsum == 45*9) sumeach = true;
		
		
		//Test all the conditions
		boolean bcheck = false;
		if (bvcheck && bhcheck && sumeach)
			bcheck = true;

		boolean value = false;
		
		if (hcheck && vcheck && bcheck)
			value = true;
		System.out.println("Horizontally correct: " + hcheck);
		System.out.println("Vertically correct: " + vcheck);
		System.out.println("Boxes correct: " + bcheck);

		return value;
	}
	}

		

