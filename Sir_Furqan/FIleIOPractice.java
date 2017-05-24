package Sir_Furqan;

import java.io.*;
import java.util.Scanner;

public class FIleIOPractice {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\AC\\Documents\\Java\\text.txt");
		Scanner in = new Scanner(fr);
		
		FileWriter fw = new FileWriter("C:/Users/AC/Desktop/output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		int T = in.nextInt();
		for ( int i = 0; i < T; i++) {
			int x = in.nextInt();
			if ( x % 2 == 0) {
				bw.write(Integer.toString(0));
			}
			else {
				bw.write(Integer.toString(1));
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		in.close();		
		/*File f = new File("C:/Users/AC/Desktop/java2learn.txt");

		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(97);
		bw.newLine();
		char[] ch1 = { 'a', 'b', 'c', 'd' };
		bw.write(ch1);
		bw.newLine();
		bw.write("TECH");
		bw.newLine();
		bw.write( (int) 65);
		int x = 43;
		String y = (String) x;
		bw.write(y);
		bw.write("" + x);
		bw.write("software");
		bw.flush();
		bw.close();
*/
	}

}
