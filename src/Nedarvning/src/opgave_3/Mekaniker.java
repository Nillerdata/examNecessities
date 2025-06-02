package Nedarvning.src.opgave_3;


public class Mekaniker extends Ansat {
    private int svendeprøveår;

    public Mekaniker(String navn, String adresse, int timeLønsSats, int svendeprøveår) {
        super(navn, adresse, timeLønsSats);
        this.svendeprøveår = svendeprøveår;
    }


    //---------------------------------------
    //get og set

    public int getSvendeprøveår() {
        return svendeprøveår;
    }

    public void setSvendeprøveår(int svendeprøveår) {
        this.svendeprøveår = svendeprøveår;
    }


    //-------------------------------------------
    /**
     * Beregner summen af ugelønnen for alle i listen
     **/
    @Override
    public double beregnloen(){
       return getTimeLønsSats() * 37;
    }


}
