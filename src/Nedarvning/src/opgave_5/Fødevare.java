package Nedarvning.src.opgave_5;

public class Fødevare extends Vare {
    private int holdbarhedsPeriode;

    public Fødevare(double pris, String navn, String beskrivelse, int holdbarhedsPeriode) {
        super(pris, navn, beskrivelse);
        this.holdbarhedsPeriode = holdbarhedsPeriode;
    }

    public int getHoldbarhedsPeriode() {
        return holdbarhedsPeriode;
    }

    public void setHoldbarhedsPeriode(int holdbarhedsPeriode) {
        this.holdbarhedsPeriode = holdbarhedsPeriode;
    }

    @Override
    public double salgsPris() {
        return getPris() * 1.05;
    }

    @Override
    public String toString() {
        return super.toString() + " holdbarhedsdato " + holdbarhedsPeriode;
    }
}
