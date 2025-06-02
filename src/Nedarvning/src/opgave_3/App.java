package Nedarvning.src.opgave_3;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Ansat a1 = new Mekaniker("Niels","Damagervej 12", 2022,250);
        Ansat a2 = new Mekaniker("Frederik","Virklundsvej 24",2015,200 );
        Ansat a3 = new Værkfører("Lasse","Damagervej 12F",2019,325,4);
        Ansat a4 = new Synsmand("Margrethe","Bobbity",2019,30,29,50);
        Ansat a5 = new ArbejdsDreng("Jeppe","kasernen",5);
        ArrayList<Ansat>Ansatte = new ArrayList<>();
        Ansatte.add(a1);
        Ansatte.add(a2);
        Ansatte.add(a3);
        Ansatte.add(a4);
        Ansatte.add(a5);

    }

    /**
     * Beregner summen af lønnen for alle ansatte i listen
     **/
    public static double samletloen(ArrayList<Ansat>list){
        double samlet = 0;

        for(Ansat a : list){
            samlet += a.beregnloen();
        }
        return samlet;
    }


}
