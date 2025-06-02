package Interface.src.opg_1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Chili c1 = new Chili("Jalapeño",5000);
        Chili c2 = new Chili("Carolina reaper",1600000);
        Chili c3 = new Chili("habanero",200000);
        Chili c4 = new Chili("bell pepper",0);
        Chili c5 = new Chili("Serrano",15000);
        Chili[]chilier = {c1,c2,c3,c4,c5};

        System.out.println(max(chilier));
        System.out.println(avg(chilier));

        Beer b1 = new Beer("Carlsberg",4.6);
        Beer b2 = new Beer("Tuborg",4.6);
        Beer b3 = new Beer("Bud light",1.0);
        Beer b4 = new Beer("Effes",4.7);
        Beer b5 = new Beer("Ceres",6.2);

        Beer[]beers = {b1,b2,b3,b4,b5};
        System.out.println(max(beers));
        System.out.println(avg(beers));


        System.out.println(Arrays.toString(blackFridayMeal(chilier,beers)));
    }
    public static Measurable max(Measurable[] objects){
        Measurable  m = objects[0];

        for (Measurable mo : objects) {
            if(mo.getMeasure() > m.getMeasure()){
                m = mo;
            }
        }
        return m;
    }
    public static double avg(Measurable[] objects){
        double avg = 0;
        int antal = 0;
        for (Measurable object : objects) {
            antal++;
            avg+= object.getMeasure();
        }
        return avg/antal;
    }
    public static Measurable[] blackFridayMeal(
            Measurable[] chilies, Measurable[] beers) {
         Measurable[]obj = new Measurable[2];
         obj[0] = max(chilies);
         obj[1] = max(beers);
         return obj;
    }
}
