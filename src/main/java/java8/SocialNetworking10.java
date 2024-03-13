 package java8;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

 public class SocialNetworking10 {
	 public static void main(String[] args) {
		 List<Person> roster = List.of(new Person());
		 System.out.println("Persons who are eligible for selective service");
		 long count = processElements(roster,
				 person -> person.age >=18 && person.age<25,
				 Person::getEmailAddress,
				 System.out::println);
		 System.out.printf("\nThere were %d persons in this category.\n", count);
	 }


	 public static <X,Y> long processElements(Collection<X> source,
			 Predicate<X> tester, Function<X,Y> mapper, Consumer<Y> block ){
		 var stream = createStream(source, tester, mapper);
		 stream.forEach(block);
		 long count = stream.count();
		 return count;
	 }

	 public static <X,Y> Stream createStream(Collection<X> source,
			 Predicate<X> tester, Function<X,Y> mapper){
		 return source.stream().filter(tester).map(mapper);
	 }
 }
