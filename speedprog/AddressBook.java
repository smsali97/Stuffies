package speedprog;

import java.util.Scanner;

public class AddressBook {
	private Person[] ab;
	private int N;
	private static int maxPersons = 100;

	public AddressBook() {
		N = 0;
		ab = new Person[maxPersons];

	}

	public void add(Person p) {
				ab[N] = p;
				N++;
	}

	public Person search(Person p) {

		for (int i = 0; i < ab.length; i++) {
			if (ab[i] == null)
				break;
			if (ab[i].equals(p)) return ab[i];
		}
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Person p1 = new Person(in.next(), in.next());
		System.out.println(p1);
		Person p2 = new Person(in.next(), in.next());
		System.out.println(p2);
		//Person p3 = new Person(in.next(), in.next());
		//System.out.println(p3);
		AddressBook ab = new AddressBook();
		ab.add(p1);
		ab.add(p2);
		// ab.add(p3);
		System.out.println( (ab.search(p1)));
		in.close();
	}

}
