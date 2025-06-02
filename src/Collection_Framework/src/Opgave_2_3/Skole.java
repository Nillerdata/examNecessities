package Collection_Framework.src.Opgave_2_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Skole {
    private String navn;
    private final Set<Studerende> studerendes = new HashSet<>();
    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }
    //add
    public void addStuderende(Studerende studerende){
        if(!studerendes.contains(studerende)){
            studerendes.add(studerende);
        }
    }
    //remove
    public void removeStuderende(Studerende studerende){
        if(studerendes.contains(studerende)){
            studerendes.remove(studerende);
        }
    }
    //get
    public List<Studerende> getStuderende() {
       return new ArrayList<>(studerendes);
    }
    public double gennemsnit(){
       double sum = 0;
       int count = 0;
        for (Studerende s : studerendes) {
            for (Integer karakter : s.getKarakterer()) {
                count++;
                sum += karakter;
            }
        }
        return sum/count;
    }
    public Studerende findStuderende (int studienr){
        Studerende studerende = null;

        for (Studerende s : studerendes) {
            if(s.getStudieNr() == studienr){
                studerende = s;
            }
        }
        return studerende;
    }
}
