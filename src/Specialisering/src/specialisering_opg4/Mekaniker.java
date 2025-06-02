package Specialisering.src.specialisering_opg4;

public class Mekaniker extends Person {
    private int svendeprøveår;
    private int timeLønsSats;

    public Mekaniker(String navn, String adresse, int svendeprøveår, int timeLønsSats) {
        super(navn, adresse);
        this.svendeprøveår = svendeprøveår;
        this.timeLønsSats = timeLønsSats;
    }
    //---------------------------------------
    //get og set

    public int getSvendeprøveår() {
        return svendeprøveår;
    }

    public void setSvendeprøveår(int svendeprøveår) {
        this.svendeprøveår = svendeprøveår;
    }

    public int getTimeLønsSats() {
        return timeLønsSats;
    }

    public void setTimeLønsSats(int timeLønsSats) {
        this.timeLønsSats = timeLønsSats;
    }

    //-------------------------------------------
    /**
     * Beregner summen af ugelønnen for alle i listen
     **/
    public int beregnloen(){
       return getTimeLønsSats() * 37;
    }


}
