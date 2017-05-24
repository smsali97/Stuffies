package Sir_Furqan;

public class GradeBook {
	// attributes
	private String courseName;
	private int[] studentMarks;
	
	// parameterized constructor
	public GradeBook(String name, int size) {
		this.courseName = name;
		this.studentMarks = new int[size];
	}
	
	// getter method for retrieving course name
	public String getCourseName() {
		return this.courseName;
	}
	
	// set marks for a particular course index
	public void setMarks(int marks, int index) {
		this.studentMarks[index] = marks;
	}
	
	// retrieve marks for a particular course
	public int getMarks(int index) {
		return this.studentMarks[index];
	}
	                                            
}

