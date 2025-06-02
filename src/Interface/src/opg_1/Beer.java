package Interface.src.opg_1;

public class Beer implements Measurable {
    private String navn;
    private double alkoholProcent;

    public Beer(String navn, double alkoholProcent) {
        this.navn = navn;
        this.alkoholProcent = alkoholProcent;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getAlkoholProcent() {
        return alkoholProcent;
    }

    public void setAlkoholProcent(double alkoholProcent) {
        this.alkoholProcent = alkoholProcent;
    }
    @Override
    public double getMeasure(){
        return alkoholProcent;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "navn='" + navn + '\'' +
                ", alkoholProcent=" + alkoholProcent +
                '}';
    }
}
