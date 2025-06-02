package Collection_Framework.src.Opgave_3;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {
    public int compare(Studerende st1, Studerende st2){
        return st1.getNavn().toLowerCase().compareTo(st2.getNavn().toLowerCase());
    }

}
