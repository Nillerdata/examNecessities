package Interface.src.opg_1;

public class Chili implements Measurable{
    private String navn;
    private double scoville;

    public Chili(String navn, double scoville) {
        this.navn = navn;
        this.scoville = scoville;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getScoville() {
        return scoville;
    }

    public void setScoville(double scoville) {
        this.scoville = scoville;
    }
    @Override
    public double getMeasure(){
        double measure = 0;
        if(scoville > 0 && scoville <= 20000000) {
            measure = scoville;
        }
      return measure;
    }

    @Override
    public String toString() {
        return "Chili{" +
                "navn='" + navn + '\'' +
                ", scoville=" + scoville +
                '}';
    }
}
