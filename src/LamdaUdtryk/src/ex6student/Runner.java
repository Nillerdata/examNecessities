package LamdaUdtryk.src.ex6student;

public class Runner {
	private String name; // not null
	private int lapTime;

	public Runner(String name) {
		this(name, 0);
	}

	public Runner(String name, int lapTime) {
		this.name = name;
		this.lapTime = lapTime;
	}

	@Override
	public String toString() {
		return String.format("Runner[%s, %d sec]", name, lapTime);
	}

	public String getName() {
		return name;
	}

	public int getLapTime() {
		return lapTime;
	}

}
