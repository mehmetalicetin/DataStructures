package java8;

import java.util.List;

public class SocialNetworking03 {
	public static void main(String[] args) {
		List<Person> roster = List.of(new Person());
		System.out.println("Persons who are eligible for selective service");

		//separate  what stay and what vary
		class CheckPersonEligibleForSelectiveService implements CheckPerson{
			@Override
			public boolean test(Person person) {
				return person.age >= 18 && person.age<25;
			}
		}//local inner class

		//member,local, anonymous inner class

		int count = printPersons(roster, new CheckPersonEligibleForSelectiveService());
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
