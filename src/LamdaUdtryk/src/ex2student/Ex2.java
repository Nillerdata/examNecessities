package LamdaUdtryk.src.ex2student;

import java.sql.SQLOutput;
import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.add(new Runner("Ib", 30));
		runners.add(new Runner("Per", 50));
		runners.add(new Runner("Ole", 27));
		runners.add(new Runner("Ulla", 40));
		runners.add(new Runner("Jens", 35));
		runners.add(new Runner("Hans", 28));

//		System.out.println(runners );
//		System.out.println();
//		runners.forEach(r-> System.out.println(r.getName() + " " + r.getLapTime()));


//		runners.forEach(r-> {
//			if (r.getLapTime() < 30) {
//				System.out.println(r.getName() + " " + r.getLapTime() );
//			}});

		/*c) Sorter løberne stigende efter lapTime ved at bruge List.sort() metoden med en
		Comparator lambda. Udskriv løberne.*/
//		runners.sort((r1,r2) -> r1.getLapTime() - r2.getLapTime());
//		System.out.println(runners);

		Collection<Integer> liste= new ArrayList<>();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		liste.add(5);
		liste.add(6);
		liste.add(7);
		liste.add(8);

//		Iterator<Integer> iterator = liste.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}

		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(2,4);
		map.put(3,9);
		map.put(4,16);
		map.put(5,25);
		map.put(6,36);



		Iterator<Integer> mapIterator = map.keySet().iterator();
		while(mapIterator.hasNext()){
			int key = mapIterator.next();
			System.out.println(key + " " + map.get(key));
		}

	}
	}
