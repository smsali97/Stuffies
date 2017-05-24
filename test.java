import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		for (int i = 0; i < 2; i++) {
			
		
		String x = String.format("%03d", in.nextInt());
		
		System.out.println(x);
		in.close();
		}
		}

}
