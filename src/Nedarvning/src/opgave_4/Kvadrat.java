package Nedarvning.src.opgave_4;

public abstract class Kvadrat extends GeometriskFigur {
    private int side;

    public Kvadrat(int x_koordinat, int y_koordinat, int side) {
        super(x_koordinat, y_koordinat);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    //----------------------------------
    @Override
    public double beregnAreal(){
        return (side*side);
    }

}
