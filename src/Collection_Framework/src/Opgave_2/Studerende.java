package Collection_Framework.src.Opgave_2;

import java.util.*;

public class Studerende {
    private int studieNr;
    private String navn;
    private List<Integer> karakterer = new ArrayList<Integer>();

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;

    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public List<Integer> getKarakterer() {
        return new ArrayList<Integer>(karakterer);
    }

    public void addKarakter(int karakter) {
            karakterer.add(karakter);
            }



}
