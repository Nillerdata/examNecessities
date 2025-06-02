package SplitSolveCombine.src.opgaver;

import java.util.ArrayList;
import java.util.List;

public class Opgave_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(7);
        list.add(0);
        System.out.println(antal(list));
    }

    public static int antal(List<Integer> list) {
        return antal(list, 0, list.size() - 1);
    }

    private static int antal(List<Integer> list, int low, int high) {
        int count = 0;

        if (low == high) {
            if(list.get(low) == 0){
                count = 1;
            }

        } else {
            int mid = (low + high) / 2;
            int l1 = antal(list, low, mid);
            int l2 = antal(list, mid + 1, high);

            count = l1 + l2;


        }
        return count;
    }
}
