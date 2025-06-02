package Collection_Framework.src.Opgave_3;

import java.util.ArrayList;
import java.util.List;

public class Studerende implements Comparable<Studerende> {
    private int studieNr;
    private String navn;
    private List<Integer> karakterer = new ArrayList<Integer>();

    public Studerende(int studieNr, String navn) {
        super();
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

    @Override
    public int compareTo(Studerende std){
        return Integer.compare(this.studieNr,std.studieNr);
    }

    @Override
    public String toString() {
        return studieNr + " " + navn + " " + karakterer;
    }
}
