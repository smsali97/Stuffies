package speedprog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("E:\\hello.txt"));
			String input;
			while ((input = br.readLine()) != null) {
				list.add(input);
			}
			br.close();

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

	}
}
