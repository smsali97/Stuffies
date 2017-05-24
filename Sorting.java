import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		/*
		 * String[] nos = new String[10];
		 * 
		 * for (int i = 0; i < nos.length; i++) { nos[i] = ""; for (int j = 0; j
		 * < 5; j++) nos[i] += possible.charAt((char) Math.floor(Math.random() *
		 * possible.length())); }
		 */
		// String[] nos = {"Kazmi", "Akmal", "Badami", "Raza", "Dawood",
		// "Alam"};

		int[] nos = new int[99999];

		for (int i = 0; i < nos.length; i++) {
			nos[i] = (int) (Math.random() * 100 + 1);
		}

		int[] numbers = new int[nos.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = nos[i];
		}

		int[] values = new int[nos.length];
		for (int i = 0; i < numbers.length; i++) {
			values[i] = nos[i];
		}

		//Quicksort
		long l1 = System.currentTimeMillis();
		Arrays.sort(values, 0, values.length - 1);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);

		//Selection Sort
		long t1 = System.currentTimeMillis();
		nos = selectionSort(nos);
		long t2 = System.currentTimeMillis();

		for (int no : nos)
			System.out.print(no + " ");
		System.out.println();
		System.out.println(t2 - t1);

		//Insertion Sort
		long x1 = System.currentTimeMillis();
		numbers = InsertionSort(numbers);
		long x2 = System.currentTimeMillis();

		for (int number : numbers)
			System.out.print(number + " ");
		System.out.println();
		System.out.println(x2 - x1);

	}

	public static int[] selectionSort(int[] list) {
		int[] sortedlist = new int[list.length];

		boolean[] seen = new boolean[list.length];
		int min = Integer.MAX_VALUE;
		int index = -1;

		for (int j = 0; j < sortedlist.length; j++) {
			for (int i = 0; i < list.length; i++) {
				if (list[i] < min && !(seen[i])) {
					min = list[i];
					index = i;
				}
			}
			seen[index] = true;
			sortedlist[j] = min;
			min = Integer.MAX_VALUE;
		}
		return sortedlist;
	}

	public static int[] InsertionSort(int[] nos) {
		for (int i = 1; i < nos.length; i++)
			for (int j = i; j > 0; j--) {
				if (nos[j - 1] > nos[j]) {
					// swap
					int t = nos[j - 1];
					nos[j - 1] = nos[j];
					nos[j] = t;
				}
			}
		return nos;
	}
	
	public static void mergeSort(String[] arry, int lo, int hi) {
	int N = hi - lo;
	//Base case
	if (N <= 1) return;
	
	int mid = lo + N/2;
	//Recurseively sorting begins!
	mergeSort(arry, lo, mid);
	mergeSort(arry, mid, hi);
		
	//Merging
	String[] aux = new String[N];
	
	int i = lo, j = mid;
	for (int k = 0; k < aux.length; k++) {
	
		//Check if one half is already sorted
		if (i==mid) aux[k] = arry[j++];
		else if (j==hi) aux[k] = arry[i++];
		
		//The actual comparison
		else if (arry[j].compareTo(arry[i]) < 0) aux[k] = arry[j++];
		else aux[k] = arry[i++];
	}
		
	//Copy it back	
	for (int m = 0; m < aux.length; m++) {
		arry[lo + m] = aux[m];
	}
				
	}

}
