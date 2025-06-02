package SplitSolveCombine.src.opgaver;

import java.util.ArrayList;
import java.util.List;

public class Opgave_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(4);
        System.out.println(sum(list));
    }

    public static int sum(List<Integer>list){
        return sum(list,0,list.size()-1);
    }

    private static int sum(List<Integer> list, int low, int high) {
        int sum = 0;

        if (low == high) {
            return list.get(low);
        } else {
            int mid = (low + high) / 2;
            int sum1 = sum(list, low, mid);
            int sum2 = sum(list, mid + 1, high);

            sum = sum1 + sum2;
        }
        return sum;
    }
}
