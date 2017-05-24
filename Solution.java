import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	private static int[] sorted_a;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}

			sorted_a = new int[a.length];
			int x = 0;
			for (int element : a) {
				sorted_a[x] = element;
				x++;
			}

			Arrays.sort(sorted_a);

			int j;
			boolean flag = true; // set flag to true to begin first pass
			int temp; // holding variable
			boolean isSorted = false;

			while (flag && !isSorted) {
				flag = false; // set flag to false awaiting a possible swap
				for (j = 0; j < a.length - 1; j++) {
					if (Math.abs(a[j] - a[j + 1]) == 1) {
						temp = a[j]; // swap elements
						a[j] = a[j + 1];
						a[j + 1] = temp;
						flag = true; // shows a swap occurred
                        isSorted = isSorted(a);
                        if (isSorted) break;
					}
				}
			}
			if (isSorted)
				System.out.println("Yes");
			else
				System.out.println("No");

		}

		in.close();
	}

	public static boolean isSorted(int[] a) {
		boolean flag = true;
		for (int l = 0; l < a.length; l++) {
			if (a[l] != sorted_a[l]) {
				flag = false;
				break;
			}
		}
		return flag;

	}
}
