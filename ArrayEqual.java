import java.util.ArrayList;

public class ArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Please enter your first array here except 0: ");
	
	ArrayList<Integer> list1 = new ArrayList<Integer>(10);
	ArrayList<Integer> list2 = new ArrayList<Integer>(10);
 
	while((StdIn.readInt()!=0))
	list1.add(StdIn.readInt());
	
System.out.println("Please enter your second array here except 0: ");
	
	while((StdIn.readInt()!=0))
	list2.add(StdIn.readInt());
	
Integer[] a = list1.toArray( new Integer[list1.size()]);
Integer[] b = list2.toArray(new Integer[list2.size()]);
	
System.out.println(ArrayEqual.isequals(a, b));


	}
	
public static boolean isequals(Integer[] a, Integer[] b) { 
boolean flag = true;
	if (a.length != b.length) flag = false;
	else {
for (int i = 0; i < a.length; i++) {
	if (a[i] != b[i]) flag = false;
}			
}
	return flag;

}

}