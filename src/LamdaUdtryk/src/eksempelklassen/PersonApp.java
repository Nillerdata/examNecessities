package LamdaUdtryk.src.eksempelklassen;

import java.util.ArrayList;
import java.util.List;

public class PersonApp {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Bent", 25));
		persons.add(new Person("Susan", 34));
		persons.add(new Person("Mikael", 60));
		persons.add(new Person("Klaus", 44));
		persons.add(new Person("Birgitte", 17));
		persons.add(new Person("Liselotte", 9));

		System.out.println(persons);
		System.out.println();

		System.out.println("Printed with List.forEach():");
		persons.forEach(p -> System.out.println(p.getName()));
		System.out.println();

		persons.forEach(p -> p.incAge());
		System.out.println(persons);
		System.out.println();

		persons.forEach(p -> {
			p.incAge();
			p.setName(p.getName() + " "+ "Jensen");
		});
		System.out.println(persons);
		System.out.println();

		System.out.println("Sorted with List.sort() on age:");
		persons.sort((p1, p2) -> p1.getAge() - p2.getAge());
		System.out.println(persons);
		System.out.println();

		System.out.println("After use of List.removeIf():");
		persons.removeIf(p -> p.getAge() < 18 || p.getAge() > 60);
		System.out.println(persons);
		System.out.println();


	}


}
