package SplitSolveCombine.src.fletning;

import fletning.measure.Measurer;

import java.util.ArrayList;

public class TestFlettesortering {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(12);
        list.add(56);
        list.add(37);
        list.add(48);
        list.add(12);
        list.add(34);
        list.add(4);
        list.add(56);

        System.out.println(list);
        Measurer.start();
        FletteSorteringHul sort = new FletteSorteringHul();
        Measurer.stop();
        System.out.println(Measurer.durationMilliSeconds());
        sort.fletteSort(list);
        System.out.println();
        System.out.println(list);
    }

}
