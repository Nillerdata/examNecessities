package Nedarvning.src.opgave_4;

public class Rektangel extends Kvadrat {
    private int sideto;

    public Rektangel(int x_koordinat, int y_koordinat, int side, int sideto) {
        super(x_koordinat, y_koordinat, side);
        this.sideto = sideto;
    }

    public int getSideto() {
        return sideto;
    }

    public void setSideto(int sideto) {
        this.sideto = sideto;
    }

    @Override
    public double beregnAreal() {
        return (getSide() * sideto);
    }

}
