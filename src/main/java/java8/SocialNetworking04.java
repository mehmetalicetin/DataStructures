package java8;

import java.util.List;

public class SocialNetworking04 {
	public static void main(String[] args) {
		List<Person> roster = List.of(new Person());
		System.out.println("Persons who are eligible for selective service");

		int count = printPersons(roster, new CheckPerson() {
			@Override
			public boolean test(Person person) {
				return person.age >=18 && person.age<25;
			}
		});//anonymous inner class
		System.out.printf("\nThere were %d persons in this category.\n", count);
	}

	private static int printPersons(List<Person> roster, CheckPerson checkPerson) {
		int count = 0;
		for (Person p : roster){
			if (checkPerson.test(p)){
				++count;
				p.printPerson();
			}
		}
		return count;
	}
}
