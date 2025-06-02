package KædetStruktur.src.listeaaastudent;


import java.util.Iterator;

public class DemoListEAaa {

    public static void main(String[] args) {
        City paris = new City("Paris", 12_000_000);
        City rom = new City("Rom", 9_000_000);
        City london = new City("London", 9_000_000);
        City amsterdam = new City("Amsterdam", 7_000_000);
        City oslo = new City("Oslo", 1_200_000);

//        ArrayListEAaa<City> list = new ArrayListEAaa<>();
//        SingleLinkedListEAaa<City> list = new SingleLinkedListEAaa<>();
        DoubleLinkedListEAaa<City> list = new DoubleLinkedListEAaa<>();
        list.add(paris);
        list.add(amsterdam);
        list.add(london);
        list.add(rom);
        list.add(oslo);
//        System.out.println(list);

//        System.out.println("Size: " + list.size());
//        System.out.println();

//        list.remove(rom);
//        System.out.println(list);
//
//        System.out.println("Size: " + list.size());
//        System.out.println();
//        list.remove(0);
//
//        System.out.println(list);
//        System.out.println("Size: " + list.size());
//        System.out.println();

        //---------------------------------------------------------------------

        System.out.println("Size: " + list.size());
        System.out.println();

       System.out.println(list.remove(rom));
       System.out.println("Size: " + list.size());
       System.out.println(list.contains(rom));

//        list.clear();
//        System.out.println("Size: " + list.size());

//        System.out.println(list.get(4));
//        System.out.println(list.remove(3));
//        System.out.println(list.indexOf(amsterdam));
//
    }
}
