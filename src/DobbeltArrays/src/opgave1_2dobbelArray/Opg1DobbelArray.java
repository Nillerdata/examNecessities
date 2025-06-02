package DobbeltArrays.src.opgave1_2dobbelArray;

/**
 * @author mad
 *
 */
public class Opg1DobbelArray {

	public static void udskrivArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "  ");
			}
			System.out.println();
		}
	}

	// Opgave 1.1
	public  static int getValueAt(int[][] numbers, int row, int col){
		//TODO returner værdien på plads (row,col) i numbers
		int result = 0;
		result = numbers[row][col];
		return result;
	}

	// Opgave 1.2
	public  static void setValueAt(int[][] numbers, int row, int col, int value){
		//TODO opdater pladsen (row,col) i numbers til value
		numbers[row][col] = value;

	}

	// Opgave 1.3
	public  static int sumRow(int[][] numbers, int row) {
		//TODO returner summen af tallene i rækken row
		int sum = 0;
		for(int i = 0; i<numbers[row].length; i++){
			sum += numbers[row][i];
		}
		return sum;
	}

	// Opgave 1.4
	public  static int sumCol(int[][] numbers, int col) {
		//TODO returner summen af tallene i kolonnen col
		int sum = 0;
		for(int i = 0; i<numbers[col].length-1;i++){
			sum += numbers[i][col];
		}
		return sum;
	}

	// Opgave 1.5
	public  static int sum(int[][] numbers) {
		//TODO returnerer summen af alle tallene i numbers
		int sum = 0;
		for(int row= 0; row< numbers.length; row++){
			for (int col = 0; col < numbers[row].length; col++) {
				sum += numbers[row][col];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] values = {{0,4,3,9,6}, {1,3,5,2,2}, {3,3,1,0,1}, {0,0,9,7,1}};
		System.out.println( "opgave 1 get value at:" + " " + getValueAt(values,0,1));
		System.out.println("opgave 2 er : set value ");
//		setValueAt(values,0,1,2);
		System.out.println("efter set " + getValueAt(values,0,1));
		System.out.println("--------------------------------------------");
		System.out.println("opgave 4 er: " + sumRow(values,2));
		System.out.println("_---------------------------------------");
		System.out.println("opgave 5 er: " + sumCol(values,0));

		System.out.println("---------------------------------------\n");
		System.out.println("opgave 6 er : " + sum(values));
		System.out.println("Værdien af tabellen udskrives");
		udskrivArray(values);

		//TODO Tilføj kode der afprøver metoderne  hørende til opgave 1.1 - 1.5

	}
}
