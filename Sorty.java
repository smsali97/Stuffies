import java.util.Arrays;

public class Sorty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 0, 3, 2};
		int[] sorted_a = new int[a.length];
        int x = 0;
        for (int element: a) {
            sorted_a[x] = element;
            x++;
        }

        Arrays.sort(sorted_a);
        
        int temp = 0;
        boolean swap_Done = true;
        while (swap_Done) {
         for(int i=0; i < a.length; i++){  
             for(int j=1; j < (a.length-i); j++){  
                 if( Math.abs(a[j]-a[j-1])== 1) {  
                     //swap elements  
                     temp = a[j-1];  
                     a[j-1] = a[j];  
                     a[j] = temp;
                     swap_Done = true;
                 }
                 else swap_Done = false;

             }
         }
        }
        for (int e: a) System.out.println(e);
        boolean flag = true;
        for (int l = 0; l < a.length; l++) {
            if ( a[l] != sorted_a[l]) {
                flag = false;
                break;
            }
        }
        

        if (flag) System.out.println("Yes");
        else System.out.println("No");
        }
	}


