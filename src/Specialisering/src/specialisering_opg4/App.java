package Specialisering.src.specialisering_opg4;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Mekaniker m1 = new Mekaniker("Niels","Damagervej 12", 2022,250);
        Mekaniker m2 = new Mekaniker("Frederik","Virklundsvej 24",2015,200 );
        Mekaniker m3 = new Værkfører("Lasse","Damagervej 12F",2019,325,2022,50);
        Mekaniker m4 = new Synsmand("Margrethe","Bobbity",2019,30,29,50);
        ArrayList<Mekaniker>mekanikerer = new ArrayList<>();
        mekanikerer.add(m1);
        mekanikerer.add(m2);
        mekanikerer.add(m3);
        mekanikerer.add(m4);

        System.out.println(m1.beregnloen());
        System.out.println(m2.beregnloen());
        System.out.println(m3.beregnloen());
        System.out.println(m4.beregnloen());
        System.out.println(samletloen(mekanikerer));

    }

    public static double samletloen(ArrayList<Mekaniker>list){
        double samlet = 0;

        for(Mekaniker m : list){
            samlet += m.beregnloen();
        }
        return samlet;
    }
}
