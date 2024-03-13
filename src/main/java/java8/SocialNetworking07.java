package java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SocialNetworking07 {
	public static void main(String[] args) {
		List<Person> roster = List.of(new Person());
		System.out.println("Persons who are eligible for selective service");

		int count = printPersons(roster, person -> person.age >=18 && person.age<25,
				Person::printPerson);//anonymous inner class with lambda
		System.out.printf("\nThere were %d persons in this category.\n", count);
	}

	private static int printPersons(List<Person> roster, Predicate<Person> tester,
			Consumer<Person> block) {
		int count = 0;
		for (Person p : roster){
			if (tester.test(p)){
				++count;
				block.accept(p);
			}
		}
		return count;
	}
}
