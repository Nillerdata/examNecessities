package Nedarvning.src.opgave_3;

public class ArbejdsDreng extends Ansat {
private int timer;
    public ArbejdsDreng(String navn, String adresse, int timeLønsSats) {
        super(navn, adresse, timeLønsSats);
        this.timer = 25;
    }

    public int getTimer() {
        return timer;
    }



    @Override
    public double beregnloen(){
        return getTimeLønsSats() * timer;
    }


}
