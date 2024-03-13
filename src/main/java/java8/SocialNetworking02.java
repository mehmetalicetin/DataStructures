package java8;

import java.util.List;

public class SocialNetworking02 {
	public static void main(String[] args) {
		List<Person> roster = List.of(new Person());
		System.out.println("Persons older than 21");
		int count = printPersonsOlderThan(roster, 21, 30);
		System.out.printf("\nThere were %d persons in this category.\n", count);
	}

	private static int printPersonsOlderThan(List<Person> roster, int low, int high) {
		int count = 0;
		for (Person p : roster) {
			if (p.age >= low && p.age < high) {
				++count;
				p.printPerson();
			}
		}
		return count;
	}
}
