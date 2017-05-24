package speedprog;

import java.util.Scanner;

public class GuessingGames {
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*10) + 1;
		
  Scanner input = new Scanner(System.in);
  int trials = input.nextInt();
     System.out.println(freqcount(Guess(num), trials));		
		
		input.close();
	}
	
	/*Take a single guess and repeat it until you find the 
	number and return it
	*/
	public static int Guess(int num) {
	int X = num;
	boolean flag = false;
		while(!flag) { 
			int Rand = (int)(Math.random()*10) + 1;	
			if (num==Rand) {
				flag=true;
				return num;
			}
			else GuessingGames.Guess(X);			
			
		}	
		  return 0;	
	}
	
	//Tabulate a frequency table of it
	public static int freqcount(int N, int trials) {
         int[] freq = new int[10];
         for (int j =0; j < trials; j++) {  
         for (int i = 0; i < freq.length; i++) {
			if(i==N) freq[i]++; 
		}
         }
         
        //Find the maximum one!
        int Maximum = Integer.MIN_VALUE;
         for (int i = 0; i < freq.length; i++) {
		   if (freq[i] > Maximum) Maximum = freq[i];
		}
         for (int i = 0; i < freq.length; i++) {
			if (Maximum==freq[i]) return i; 			
		}
         return 0;
	}
			
 
}


