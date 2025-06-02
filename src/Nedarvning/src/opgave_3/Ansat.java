package Nedarvning.src.opgave_3;

import java.util.ArrayList;

public abstract class Ansat extends  Person {
    private int timeLønsSats;
    public Ansat(String navn, String adresse,int timeLønsSats) {
        super(navn, adresse);
    }

    public int getTimeLønsSats() {
        return timeLønsSats;
    }

    public void setTimeLønsSats(int timeLønsSats) {
        this.timeLønsSats = timeLønsSats;
    }

    public abstract double beregnloen();

}
