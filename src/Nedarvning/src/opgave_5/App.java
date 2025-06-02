package Nedarvning.src.opgave_5;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Vare f1 = new Fødevare(100,"broccoli","kæmpe motherfucker",20);
        Vare e1 = new ElArtikler(50,"LEDpære","Byggemand bobs favorit",50);
        Vare s1 = new Spiritus(500,"conquistador rom","den er møj god",40);

        ArrayList<Vare>varer = new ArrayList<>();
//        varer.add(f1);
//        varer.add(e1);
        varer.add(s1);

        Indkøbsvogn i1 = new Indkøbsvogn();

        System.out.println(i1.indkøb(varer));
    }
}
