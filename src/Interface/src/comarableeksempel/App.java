package Interface.src.comarableeksempel;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Jensen");
		p1.setMonthlySalary(1000);

		Person p2 = new Person("Andersen");
		p2.setMonthlySalary(2000);

		if (p1.compareTo(p2) < 0) {
			System.out.println(p1.getName() + "(" + p1.getMonthlySalary() + ")" + " er mindre end " + p2.getName() + "("
					+ p2.getMonthlySalary() + ")");
		} else if (p1.compareTo(p2) > 0) {
			System.out.println(p2.getName() + "(" + p2.getMonthlySalary() + ")" + " er mindre end " + p1.getName() + "("
					+ p1.getMonthlySalary() + ")");
		} else {
			System.out.println(p1.getName() + "(" + p1.getMonthlySalary() + ")" + " er lige med " + p2.getName() + "("
					+ p2.getMonthlySalary() + ")");
		}

		ArrayList<Person> personer = new ArrayList<>();
		personer.add(p1);
		personer.add(p2);
		System.out.println(personer);
		Collections.sort(personer);
		System.out.println(personer);
	}


}
