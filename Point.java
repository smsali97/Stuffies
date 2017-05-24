
public class Point {
	// member variables
	private int x;
	private int y;
	
	// param. constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// using distance formula
	public double distance(Point p) {
		int dx = this.x - p.x;
		int dy = this.y - p.y;
		
		return Math.sqrt( dx*dx + dy*dy);
	}
}
