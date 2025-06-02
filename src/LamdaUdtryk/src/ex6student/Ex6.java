package LamdaUdtryk.src.ex6student;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.add(new Runner("Ib", 30));
		runners.add(new Runner("Per", 50));
		runners.add(new Runner("Ole", 27));
		runners.add(new Runner("Ulla", 40));
		runners.add(new Runner("Jens", 35));
		runners.add(new Runner("Hans", 28));

		System.out.println(runners);
		System.out.println();

		// OBS: Throws exception.
		for (Runner runner : runners) {
			if (runner.getLapTime() > 40)
				runners.remove(runner);
		}
		System.out.println(runners);
		System.out.println();

	}
}