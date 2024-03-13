 package java8;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SocialNetworking09 {
	public static void main(String[] args) {
		List<Person> roster = List.of(new Person());
		System.out.println("Persons who are eligible for selective service");
		int count = processElements(roster,
				person -> person.age >=18 && person.age<25,
				Person::getEmailAddress,
				System.out::println);
		System.out.printf("\nThere were %d persons in this category.\n", count);
	}

	public static <X,Y> int processElements(Collection<X> source,
			Predicate<X> tester, Function<X,Y> mapper, Consumer<Y> block ){
		int count = 0;
		for (X x : source){
			if (tester.test(x)){
				++count;
				Y y = mapper.apply(x);
				block.accept(y);
			}
		}
		return count;
	}
}
