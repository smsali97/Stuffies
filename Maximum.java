
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a = StdIn.readDouble();
double b = StdIn.readDouble();
double c = StdIn.readDouble();
int M = 0;
double N = 0.0;

if (Math.floor(a)==a && Math.floor(b)==b && Math.floor(c)==c ) M = Maximum.max3( (int) a,(int) b,(int) c);
	else N = Maximum.max3(a, b, c);

if (M==0) System.out.println("Your maximum is " + N);
else System.out.println("Your maximum is " + M);

	}
	
	public static int max3(int a, int b, int c) {
 int Max = Integer.MIN_VALUE;
 if (a>Max) Max = a;
 if (b>Max) Max = b;
 if (c>Max) Max = c;
 return Max;	
}
	public static double max3(double a, double b, double c) {
		 double Max = Double.NEGATIVE_INFINITY;
		 if (a>Max) Max = a;
		 if (b>Max) Max = b;
		 if (c>Max) Max = c;
		 return Max;

}
	
}	
	