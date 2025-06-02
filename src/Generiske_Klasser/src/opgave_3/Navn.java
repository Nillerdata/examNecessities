package Generiske_Klasser.src.opgave_3;

public class Navn implements Comparable<Navn> {
    private String fornavn;
    private String efternavn;

    public Navn(String fornavn, String efternavn) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }

    public String getFornavn() {
        return fornavn;
    }



    public String getEfternavn() {
        return efternavn;
    }



    @Override
    public int compareTo(Navn o) {
        if (this.fornavn.compareTo(o.fornavn) == 0) {
            return this.efternavn.compareTo(o.efternavn);
        } else return this.fornavn.compareTo(o.fornavn);
    }
}
