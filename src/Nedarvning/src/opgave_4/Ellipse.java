package Nedarvning.src.opgave_4;

public class Ellipse extends  Cirkel{
    private double radius2;

    public Ellipse(int x_koordinat, int y_koordinat, double radius, double radius2) {
        super(x_koordinat, y_koordinat, radius);
        this.radius2 = radius2;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public double beregnAreal(){
        return Math.PI * getRadius() * radius2;
    }
}
