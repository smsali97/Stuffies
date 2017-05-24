import java.util.Scanner;

public class TriangleTestApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Point p1 = new Point(in.nextInt(), in.nextInt());
		Point p2 = new Point(in.nextInt(), in.nextInt());
		Point p3 = new Point(in.nextInt(), in.nextInt());
		
		Triangle triangle = new Triangle(p1, p2, p3);
		System.out.println("Triangle is " + triangle);
		System.out.println("Perimeter is " + triangle.getPerimeter());
		System.out.println("Type is " + triangle.getType());
		
		in.close();
	}

}
