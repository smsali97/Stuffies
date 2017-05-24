package speedprog;
import java.util.Scanner;


public class Person {

	public String first;
	public String last;
	public int id;
	
	
	private static int nextid = 1001;
	
	public Person(String f, String l) {
		first = f;
		last = l;
		id = nextid;
		nextid++;
	}
	
	
	public String toString() {
		String s = "The name of the person is: " + first + " " + last + "\n";
		s += "Your id is: " + id + "\n";
		return s;
	}
	
	public boolean equals(Person b) {
		if(first.equals(b.first) && last.equals(b.last) ) return true;
		else return false;
	}
	
	public int IDequals(Person b) {
		if( id  == b.id ) return id;
		else return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Person p1 = new Person(in.next(),in.next());
		System.out.println(p1);
		Person p2 = new Person(in.next(),in.next());
		System.out.println(p2);
		in.close();
	}
	
	public String getName() {
		return first + " " + last;
		
	}

}

