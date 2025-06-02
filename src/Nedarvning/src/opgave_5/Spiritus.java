package Nedarvning.src.opgave_5;

public class Spiritus extends Vare {
    private double alkoholprocent;

    public Spiritus(double pris, String navn, String beskrivelse, double alkoholprocent) {
        super(pris, navn, beskrivelse);
        this.alkoholprocent = alkoholprocent;
    }

    public double getAlkoholprocent() {
        return alkoholprocent;
    }

    public void setAlkoholprocent(double alkoholprocent) {
        this.alkoholprocent = alkoholprocent;
    }

    @Override
    public double salgsPris() {
        double samletpris = 0.0;
        if (getPris() >= 90) {
            samletpris += getPris() * 2.2;
        }
        return samletpris;
    }

    @Override
    public String toString() {
        return super.toString() + " procent " + alkoholprocent;
    }
}
