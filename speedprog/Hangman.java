package speedprog;

import java.util.Scanner;

public class Hangman {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// LETS CREATE A HANGMAN GAME

		
		//The word you have to guess
		String puzzle = "joker";
		// int length = puzzle.length();
		// char[] letters = puzzle.toCharArray(); 

		
		//Search as long as the word gets guessed correctly
		while(!puzzle.isEmpty()) {
			char c = letterInput();
			if (c=='/') {
				System.out.println("You did not follow the rules! :(");
				break;
			}
			
			// char x = letterChecker(c, letters);
			
		
		}
		
		
	}
		
	public static char letterChecker(char c, char[] letters) {
		if (c=='*' || c=='/') return '/';
		
	    for (char letter : letters) {
	    	if (letter==c) return 'c';
	    }
		
	return '*';	
		
	}
	
	//Check for input
	public static char letterInput() {
	
		System.out.println("Please enter a letter: ");
	
	
	if (in.hasNext()) {
		String x  = in.next();
		if (x.length() != 1) return '*';
	
		return x.charAt(0);
	}
	return '/'; 
		

	}
		
		
	}


