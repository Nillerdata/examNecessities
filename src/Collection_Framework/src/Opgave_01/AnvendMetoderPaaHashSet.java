package Collection_Framework.src.Opgave_01;



import java.util.Set;
import java.util.TreeSet;

public class AnvendMetoderPaaHashSet {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
//de bliver tildelt tilfældig plads i rækkefølgen
        //forestil i stedet for en indeks så de bare bliver kastet ned i en bobbel
        set.add(34);
        set.add(12);
        set.add(23);
        set.add(45);
        set.add(67);
        set.add(34);
        set.add(98);
        System.out.println(set);
        set.add(23);//ingen dupletter
        System.out.println(set.contains(23));

        System.out.println(set);
        set.remove(67);
        System.out.println(set);

        System.out.println(set.size());
    }
}
