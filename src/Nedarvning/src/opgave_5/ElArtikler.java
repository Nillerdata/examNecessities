package Nedarvning.src.opgave_5;

public class ElArtikler extends Vare {
    private double energiforbrug;

    public ElArtikler(double pris, String navn, String beskrivelse, double energiforbrug) {
        super(pris, navn, beskrivelse);
        this.energiforbrug = energiforbrug;
    }

    public double getEnergiforbrug() {
        return energiforbrug;
    }

    public void setEnergiforbrug(double energiforbrug) {
        this.energiforbrug = energiforbrug;
    }

    @Override
    public double salgsPris() {
        double samletpris = 0.0;
        if (getPris() * 0.30 >= 3) {
            samletpris += getPris() + (getPris() * 0.3);
        }
        return samletpris;
    }

    @Override
    public String toString() {
        return super.toString() + " energiforbrug " + energiforbrug;
    }
}
