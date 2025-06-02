package KædetStruktur.src.cityarraylist;

public class City {
	private String name;
	private int inhabitants;

	public City(String name, int inhabitants) {
		this.name = name;
		this.inhabitants = inhabitants;
	}

	public String getName() {
		return name;
	}

	public int getInhabitants() {
		return inhabitants;
	}

	@Override
	public String toString() {
		return name + ": " + inhabitants;
	}

}
