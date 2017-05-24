package speedprog;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String s1 = in.next();
		String s2 = in.next();
		in.close();
		
		String s = s1.toLowerCase();
		char[] a = s.toCharArray();
		int n = a.length;

		String t = s2.toLowerCase();
		char[] b = t.toCharArray();
		int m = b.length;

		for (int i = 0; i < n; i++) {
			char c = a[i];
			if (!Character.isWhitespace(c)) {
				boolean flag = false;
				for (int j = 0; j < m; j++) {
					if (b[j] == c) {
						b[j] = ' ';
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("Input strings are not anagrams");
					return;
				}
			}

		}

		for (int j = 0; j < m; j++) {
			if (!Character.isWhitespace(b[j])) {
				System.out.println("Input strings are not anagrams");
				return;
			}
		}

		System.out.println("Input strings are anagrams");
	}

}
