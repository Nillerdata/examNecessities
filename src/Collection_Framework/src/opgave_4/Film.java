package Collection_Framework.src.opgave_4;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Film {
    public static void main(String[] args) {
        lavfil("film");
    }

    public static void lavfil(String filnavn) {
        try {
            File nyFil = new File(filnavn);
            Scanner scan = new Scanner(nyFil);
            String antal = scan.nextLine();
            Map<String, ArrayList<Integer>> film = new HashMap<>();

            while (scan.hasNext()) {
                String titel = scan.nextLine();
                if (!film.containsKey(titel)) {
                    ArrayList<Integer> karakter = new ArrayList<>();
                    int tal = Integer.parseInt(scan.nextLine());
                    karakter.add(tal);

                    film.put(titel, karakter);
                } else {
                    int tal = Integer.parseInt(scan.nextLine());
                    film.get(titel).add(tal);
                }
            }

            for (String s : film.keySet()) {
                double sum = 0;
                for (Integer ints : film.get(s)) {
                    sum += ints;
                }
                double gen = sum / film.get(s).size();
                System.out.println(s + ": " + film.get(s).size() + " karakterer, gennemsnit " + gen);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
