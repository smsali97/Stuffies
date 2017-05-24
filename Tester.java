import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		// For reading the data
		Scanner in = new Scanner(System.in);

		// Day count
		int count = 0;
		// Total Snow fall
		double sum = 0;
		//Minimum temperature
		int min = Integer.MAX_VALUE;
		
		while (in.hasNext()) {
			double snowfall = in.nextDouble();
			sum += snowfall;

			int temp = in.nextInt();
			if (temp < min) min = temp;
			
		count++;
		}
		
		in.close();
		
		System.out.println("Number of days: " + count + 
	    "/n Total Snow: " + sum + "/n Coldest temperature: " + min);

	}

}