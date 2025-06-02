package Nedarvning.src.øvelse;

import java.util.Objects;

public class Student extends  Person {

    private String hovedfag;

    public Student(String navn, int fødselsår, String hovedfag) {
        super(navn, fødselsår);
        this.hovedfag = hovedfag;
    }

    public String getHovedfag() {
        return hovedfag;
    }

    public void setHovedfag(String hovedfag) {
        this.hovedfag = hovedfag;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hovedfag;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && hovedfag.equals(((Student) o).hovedfag);
    }
}
