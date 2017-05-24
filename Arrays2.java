public class Arrays2 {
	public static void main(String[] args) {
	
	}
		
	//Find the index where the maximum contains
	public static int maxIndex(int[] array) {
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < array.length; i++) {
		if (array[i] > max)
			max = i;
	}
	return max;
	}
	
	//Swap array
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	//Print array
	public static void print(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	//is Array Sorted already?
	public static boolean isSorted(int[] array, int[] SortedArray) {
		for (int i = 0; i < SortedArray.length; i++) {
			if (array[i]!=SortedArray[i]) return false;
		}
	return true;	
	}
   
}