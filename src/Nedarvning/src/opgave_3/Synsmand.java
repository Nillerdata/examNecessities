package Nedarvning.src.opgave_3;

public class Synsmand extends Mekaniker{

    private int tillæg;
    private int antalSyn;
    public Synsmand(String navn, String adresse, int svendeprøveår, int timeLønsSats, int tillæg,int antalSyn) {
        super(navn, adresse, svendeprøveår, timeLønsSats);
        this.tillæg = tillæg;
        this.antalSyn = antalSyn;
    }
    //------------------------------
    //get og set

    public int getTillæg() {
        return tillæg;
    }

    public void setTillæg(int tillæg) {
        this.tillæg = tillæg;
    }

    public int getAntalSyn() {
        return antalSyn;
    }

    public void setAntalSyn(int antalSyn) {
        this.antalSyn = antalSyn;
    }
    @Override
    public double beregnloen(){
        return (tillæg * antalSyn) + getTimeLønsSats() * 37;
        //return super.beregnløn + (tillæg * antalSyn)
    }
}
