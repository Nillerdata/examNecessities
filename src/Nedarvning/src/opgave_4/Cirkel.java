package Nedarvning.src.opgave_4;

public class Cirkel extends GeometriskFigur {
    private double radius;

    public Cirkel(int x_koordinat, int y_koordinat, double radius) {
        super(x_koordinat, y_koordinat);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double beregnAreal(){
        return Math.PI * (Math.sqrt(radius));
    }
}
