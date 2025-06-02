package LamdaUdtryk.src.ex0name;

public class App {
    public static void main(String[] args) {
        Person name = new Person("Margrethe", "Mosbæk", "Dybdahl");
        name.printName((first, middle, surname) -> first + " " + middle.charAt(0) + ". " + surname);

    }
}
