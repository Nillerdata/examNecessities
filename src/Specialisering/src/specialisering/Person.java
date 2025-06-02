package Specialisering.src.specialisering;

public class Person {
    private String navn;
    private String adresse;

    //------------------------------------

    protected Person(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }
    //------------------------------------
    //get og set

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
