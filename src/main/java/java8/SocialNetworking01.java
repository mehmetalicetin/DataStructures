package java8;

import java.util.List;

public class SocialNetworking01 {
	public static void main(String[] args) {
		List<Person> roster = List.of(new Person());
		System.out.println("Persons older than 21");

		int count = printPersonsOlderThan(roster, 21);
		System.out.printf("\nThere were %d persons in this category.\n", count);
	}

	private static int printPersonsOlderThan(List<Person> roster, int age) {
		int count = 0;

		for (Person p : roster){
			if(p.age >= 21){
				++count;
				p.printPerson();
			}
		}
		return count;
	}
}
