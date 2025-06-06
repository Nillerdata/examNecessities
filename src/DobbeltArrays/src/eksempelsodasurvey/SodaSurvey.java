package DobbeltArrays.src.eksempelsodasurvey;

public class SodaSurvey {
	// -----------------------------------------------------------------
	// Determines and prints the average of each row (soda) and each
	// column (respondent) of the survey scores.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		int[][] scores = { { 3, 4, 5, 2, 1, 4, 3, 2, 4, 4 },
				{ 2, 4, 3, 4, 3, 3, 2, 1, 2, 2 },
				{ 3, 5, 4, 5, 5, 3, 2, 5, 5, 5 },
				{ 1, 1, 1, 3, 1, 2, 1, 3, 2, 4 } };

		final int SODAS = scores.length;
		final int PEOPLE = scores[0].length;

		int[] sodaSum = new int[SODAS];
		int[] personSum = new int[PEOPLE];

		for (int soda = 0; soda < SODAS; soda++) {
			for (int person = 0; person < PEOPLE; person++) {
				sodaSum[soda] = sodaSum[soda] + scores[soda][person];
				personSum[person] = personSum[person] + scores[soda][person];
			}
		}

		System.out.println("Averages:\n");

		for (int soda = 0; soda < SODAS; soda++) {
			System.out.println("Soda #" + (soda + 1) + ": "
					+ (double) sodaSum[soda] / PEOPLE);
		}

		System.out.println();
		for (int person = 0; person < PEOPLE; person++) {
			System.out.println("Person #" + (person + 1) + ": "
					+ (double) personSum[person] / SODAS);
		}
	}
}
