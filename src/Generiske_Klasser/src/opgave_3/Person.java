package Generiske_Klasser.src.opgave_3;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {
    private T navn;

    public Person(T navn) {
        this.navn = navn;
    }

    public T getNavn() {
        return navn;
    }


    @Override
    public int compareTo(Person<T> o) {

        return this.navn.compareTo(o.navn);
    }
}
