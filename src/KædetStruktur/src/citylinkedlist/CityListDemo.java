package KædetStruktur.src.citylinkedlist;

public class CityListDemo {

	public static void main(String[] args) {
		City paris = new City("Paris", 1);
		City rom = new City("Rom", 1);
		City london = new City("London", 1);
		City amsterdam = new City("Asterdam", 2);
		City oslo = new City("Oslo", 1);

//		City paris = new City("Paris", 12000000);
//		City rom = new City("Rom", 900000);
//		City london = new City("London", 900000);
//		City amsterdam = new City("Asterdam", 700000);
//		City oslo = new City("Oslo", 12000);

		CityList list = new CityList();
		list.addFirst(oslo);
		list.addFirst(rom);
		list.addFirst(london);
		list.addFirst(amsterdam);
		list.addFirst(paris);
		System.out.println(list.countCities());
//		list.removeCity(rom);
//		list.removeFirst();
//		System.out.println(list.countCities());

//		System.out.println("Opgave 1: " + list.numerInhabitants());
//
//		System.out.println("Opgave 2: " + list.getLast());

		System.out.println("Opgave 3: " + list.removeLast());
		System.out.println(list.getLast());

	}
}
