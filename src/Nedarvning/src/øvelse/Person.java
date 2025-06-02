package Nedarvning.src.øvelse;

import java.util.Objects;

public class Person {
    private String navn;
    private int fødselsår;

    public Person(String navn, int fødselsår) {
        this.navn = navn;
        this.fødselsår = fødselsår;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getFødselsår() {
        return fødselsår;
    }

    public void setFødselsår(int fødselsår) {
        this.fødselsår = fødselsår;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", fødselsår=" + fødselsår +
                '}';
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Person)) return false;
            Person p = (Person) o;
            return navn.equals(p.navn) && fødselsår == p.getFødselsår();
    }



}
