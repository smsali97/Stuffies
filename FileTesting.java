import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTesting {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		FileReader file = new FileReader("NewInput.txt");
		Scanner in = new Scanner(file);
		
		FileWriter fw = new FileWriter("helpmepls.txt");
		int T = in.nextInt();
		
		for (int i = 0; i < T; i++) {
			int x = in.nextInt();
			 x = x*x;
			fw.write(Integer.toString(x+8) + System.getProperty("line.separator"));
		}
		
		in.close();
		fw.close();
	}

}
