package Nedarvning.src.øvelse;

public class Instructor extends Person {
    private double månedsløn;

    public Instructor(String navn, int fødselsår, double månedsløn) {
        super(navn, fødselsår);
        this.månedsløn = månedsløn;
    }

    public double getMånedsløn() {
        return månedsløn;
    }

    public void setMånedsløn(double månedsløn) {
        this.månedsløn = månedsløn;
    }

    @Override
    public String toString() {
        return super.toString() + månedsløn;
    }
    public boolean equals(Object o){
        return super.equals(o) && månedsløn == ((Instructor)o).månedsløn;
    }


}
