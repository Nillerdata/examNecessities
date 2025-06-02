package Collection_Framework.src.opgave_2_2;

import java.util.*;

public class Skole {
    private String navn;
    private final HashMap<Integer,Studerende> studerendes = new HashMap();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }
    //add
    public void addStuderende(Studerende studerende){
        studerendes.put(studerende.getStudieNr(),studerende);
    }
    //remove
    public void removeStuderende(Studerende studerende){
        studerendes.remove(studerende.getStudieNr(),studerende);
    }

    public double gennemsnit(){
       double sum = 0;
       int count = 0;
        for (Studerende s : studerendes.values()) {
            for (Integer karakter : s.getKarakterer()) {
                count++;
                sum += karakter;
            }
        }
        return sum/count;
    }
    public Studerende findStuderende (int studienr){
        return studerendes.get(studienr);
    }
}
