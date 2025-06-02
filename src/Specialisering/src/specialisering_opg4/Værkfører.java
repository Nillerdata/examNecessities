package Specialisering.src.specialisering_opg4;

public class Værkfører extends Mekaniker {
    private int årForUdnævnelse;
    private int tillæg;

    public Værkfører(String navn, String adresse, int svendeprøveår, int timeLønsSats, int årForUdnævnelse, int tillæg) {
        super(navn, adresse, svendeprøveår, timeLønsSats);
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
    public int beregnloen(){//kan også laves med super
        return (getTimeLønsSats() + tillæg) * 37;
    }
}
