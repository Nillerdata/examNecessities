package Generiske_Klasser.src.opgave_3;

public class App {

    public static void main(String[] args) {
        Person<String>person = new Person<>("hola");
        Navn n1 = new Navn("Niels","Glensgaard");
        Person<Navn>person1 = new Person<>(n1);
    }
}
