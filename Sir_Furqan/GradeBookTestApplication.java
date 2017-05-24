package Sir_Furqan;

import java.util.Scanner;

public class GradeBookTestApplication {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		GradeBook[] gb = new GradeBook[3];
		int size1 = 0;
		
		for (int i = 0; i < gb.length; i++) {
			System.out.println("Please enter course no. " + (i+1) + "'s name and then capacity:");
			String course = in.next();
			int size;
			do {
			size = in.nextInt();
			} while ( size < 0);
			
			// save the size for first course only
			if ( i == 0) {
				size1 = size;
			}
			// instantiate!!
			gb[i] = new GradeBook(course,size);
		}
		
		// enter marks for course no. 1
		
		System.out.print("(Course 1) ");
		for (int i = 0; i < size1; i++) {
			System.out.println("Please enter marks for student number no#" + (i+1) );
			gb[0].setMarks(in.nextInt(), i);
		}
		
		System.out.println("Course name: " + gb[0].getCourseName());
		for (int i = 0; i < size1; i++) {
			System.out.print("Marks of student with serial no #" + i + " is: " + gb[0].getMarks(i));
			System.out.println();
		}
		
		in.close();
	}
}