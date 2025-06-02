package Nedarvning.src.opgave_4;

public abstract class GeometriskFigur {
    private int x_koordinat;
    private int y_koordinat;

    public GeometriskFigur(int x_koordinat, int y_koordinat) {
        this.x_koordinat = x_koordinat;
        this.y_koordinat = y_koordinat;
    }

    public int getX_koordinat() {
        return x_koordinat;
    }

    public void setX_koordinat(int x_koordinat) {
        this.x_koordinat = x_koordinat;
    }

    public int getY_koordinat() {
        return y_koordinat;
    }

    public void setY_koordinat(int y_koordinat) {
        this.y_koordinat = y_koordinat;
    }

    public final void parllelforskydning(int x_koordinat,int y_koordinat){
        this.x_koordinat += x_koordinat;
        this.y_koordinat += y_koordinat;
    }

    public abstract double beregnAreal();
}
