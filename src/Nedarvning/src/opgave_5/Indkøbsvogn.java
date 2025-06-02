package Nedarvning.src.opgave_5;

import java.util.ArrayList;

public class Indkøbsvogn {


    public double indkøb(ArrayList<Vare> varer) {
        double pris = 0.0;
        for (Vare vare : varer) {
            System.out.println(vare.toString());
            pris += vare.salgsPris();
        }

        return pris;
    }

}
