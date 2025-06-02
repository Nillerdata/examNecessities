package Nedarvning.src.opgave_3;

public class Værkfører extends Ansat {
    private int årForUdnævnelse;
    private int tillæg;

    public Værkfører(String navn, String adresse, int timeLønsSats, int årForUdnævnelse, int tillæg) {
        super(navn, adresse, timeLønsSats);
        this.årForUdnævnelse = årForUdnævnelse;
        this.tillæg = tillæg;
    }

    //------------------------------------

    public int getÅrForUdnævnelse() {
        return årForUdnævnelse;
    }

    public void setÅrForUdnævnelse(int årForUdnævnelse) {
        this.årForUdnævnelse = årForUdnævnelse;
    }

    public int getTillæg() {
        return tillæg;
    }

    public void setTillæg(int tillæg) {
        this.tillæg = tillæg;
    }

    @Override
    public double beregnloen(){//kan også laves med super
        return (getTimeLønsSats()*37) + (tillæg);
    }
}
