package java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SocialNetworking08 {
	public static void main(String[] args) {
		List<Person> roster = List.of(new Person());
		System.out.println("Persons who are eligible for selective service");

		int count = printPersons(roster, person -> person.age >=18 && person.age<25,
				Person::getEmailAddress,
				System.out::println);//anonymous inner class with lambda
		System.out.printf("\nThere were %d persons in this category.\n", count);
	}

	private static int printPersons(List<Person> roster, Predicate<Person> tester,
			Function<Person, String> mapper, Consumer<String> block) {
		int count = 0;
		for (Person p : roster){
			if (tester.test(p)){
				++count;
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
		return count;
	}
}
