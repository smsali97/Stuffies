
public class Triangle {
	private Point v1;
	private Point v2;
	private Point v3;
	
	// param. constructor
	public Triangle(Point p1, Point p2, Point p3) {
		v1 = p1;
		v2 = p2;
		v3 = p3;
	}
	
	@Override
	public String toString() {
		// "MyTriangle[v1=(x1,y1),v2=(x2,y2),v3=(x3,y3)]"
		String str = String.format("MyTriangle[v1=(%d,%d),v2=(%d,%d),v3=(%d,%d)]",v1.getX(),v1.getY(),v2.getX(),v2.getX(),v3.getX(),v3.getY());
		
		return str;
	}
	
	// perimeter = sum of 3 sides
	public double getPerimeter() {
		return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
	}
	
	// equilateral all three sides equal, isoceles two sides, scalene one side
	public String getType(){
		double side1 = v1.distance(v2);
		double side2 = v2.distance(v3);
		double side3 = v3.distance(v1);
		
		if ( side1 == side2 && side2 == side3) {
			return "Equilateral";
		}
		else if ( side1 == side2 || side2 == side3 || side3 == side1) {
			return "Isosceles";
		}
		else return "Scalene";
	}
}
