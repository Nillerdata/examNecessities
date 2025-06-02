package LamdaUdtryk.src.opgave;

import java.util.ArrayList;
import java.util.List;

public class opgave_5 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>(List.of(
                "Jan Jensen", "Jens Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen"
        ));

        System.out.println(countDelStreng(liste, "Jens"));
        
        System.out.println(countDelStrengSplitSolveCombine(liste, "Jens"));
        System.out.println(RendMigRekursion(liste, "Jens"));
    }

    public static int countDelStreng(List<String> list, String sub) {
        int count = 0;
        for (String s : list) {
            String[] bob = s.split(sub);
            count += bob.length - 1;
        }

        return count;
    }

    public static int RendMigRekursion(List<String> list, String sub) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return RendMigRekursion(list.subList(1, list.size()), sub) + list.getFirst().split(sub).length - 1;
        }
    }

    public static int countDelStrengSplitSolveCombine(List<String> list, String sub) {
        return maximum(list, 0, list.size() - 1, sub);

    }

    private static int maximum(List<String> list, int l, int h, String sub) {
        if (l == h) {
            return list.get(l).split(sub).length - 1;
        } else {
            int m = (l + h) / 2;
//            int max1 = maximum(list, l, m,sub);
//            int max2 = maximum(list, m + 1, h,sub);
//            return max1 + max2;
            return maximum(list, l, m, sub) + maximum(list, m + 1, h, sub);

        }

    }
}
