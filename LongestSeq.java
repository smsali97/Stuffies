
public class LongestSeq {

	public static void main(String[] args) {

		int num1 = StdIn.readInt();
		int count=0;
		int longestnumber = 0;
		int cons1 = 1;
		int cons2 = 1;
		while(!StdIn.isEmpty()) {
   int num2 = StdIn.readInt();
   if (num1==num2) {
	cons1++;
	longestnumber = num2;
	count++;
   }
   if (num1!=num2 && cons2 > cons1)
   {
	  longestnumber = num2;
	  cons2++;
	  cons1 = cons2;
	  count++;
   }
   
   num1 = num2;
	}

	System.out.println("Your longest number is " + longestnumber + " which "
			+ "was consecutive for the run: " + count + " times");	

}

}
