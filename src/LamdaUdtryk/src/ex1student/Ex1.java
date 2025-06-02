package LamdaUdtryk.src.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.jar.JarEntry;

public class Ex1 {

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



		//Den første person der hedder Klaus
//		System.out.println(findFirst(persons, p -> p.getName().equals("Klaus")));
		//Den første person der har et navn med længden 4
//		System.out.println(findFirst(persons, p -> p.getName().length() ==4 ));

//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
		//den første person med alderen 44
		System.out.println(findFirst(persons, p-> p.getAge()==44));
		//første person med navn som starter med S
		System.out.println(findFirst(persons,person -> person.getName().charAt(0) == 'S'));
		//Finder den første person i listen af personer med et navn der indeholder mere end et ’i’;

		System.out.println(findFirst(persons,p->
		{
			int iCount = 0;
			for (char person : p.getName().toCharArray()) {
				if(person == 'i'|| person == 'I'){
					iCount++;
					if(iCount == 2){
						return true;
					}
				}

			}
			return false;
		}));

		System.out.println(findFirst(persons,p->
				p.getName().length() == p.getAge()

		));

		//f) Find alle personer der har et navn der indeholder bogstavet 'i'
		System.out.println(findAll(persons,p -> p.getName().contains("i")));

		System.out.println();
//g) Find alle personer der har et navn der starter med 'S'.
		System.out.println(findAll(persons,p ->p.getName().charAt(0)=='S'));
		System.out.println();

		//h) Find alle personer der har et navn der med længde 5.
		System.out.println(findAll(persons,p-> p.getName().length() == 5));
		System.out.println();
		//i ) Find alle personer der har et navn der med længde mindst 6 og alder under 40.
		System.out.println(findAll(persons,p-> p.getName().length() >6 && p.getAge() < 40));

	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}
	public static List<Person> findAll(List<Person> list, Predicate<Person> filter){
		List<Person> godkendte = new ArrayList<>();
		for (Person p : list){
			if(filter.test(p)){
				godkendte.add(p);
			}
		}
		return godkendte;
	}
}
