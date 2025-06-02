package SplitSolveCombine.src.opgaver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Opgave_3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Janus");
        list.add("Markus");
        list.add("Peter");
        list.add("Line");
        list.add("Mads");
        list.add("Søren");
        list.add("Mathias");
        list.add("Trine");
        list.add("Anders");
//        System.out.println(countLengthN(list, 5));
//        printString(list, 5);
        System.out.println(listLengthList(list,5));
    }

    public static int countLengthN(List<String> s, int n) {
        return countLengthNHelp(s, n, 0, s.size() - 1);
    }


    private static int countLengthNHelp(List<String> s, int n, int low, int high) {
        int count = 0;

        if (low == high) {
            if (s.get(low).length() == 5) {
                count = 1;
            }

        } else {
            int mid = (low + high) / 2;
            int l1 = countLengthNHelp(s, n, low, mid);
            int l2 = countLengthNHelp(s, n, mid + 1, high);


            count = l1 + l2;

        }
        return count;
    }

    public static void printString(List<String> s, int n) {
        printStringHelp(s, n, 0, s.size() - 1);
    }

    private static void printStringHelp(List<String> s, int n, int low, int high) {


        if (low == high) {
            if (s.get(low).length() == n) {
                System.out.println(s.get(low));
            }

        } else {
            int mid = (low + high) / 2;
            printStringHelp(s, n, low, mid);
            printStringHelp(s, n, mid + 1, high);

        }
    }

    public static ArrayList<String> listLengthList(List<String> s, int n){
            ArrayList<String>list = new ArrayList<>();
        return listLenghthListHelp(s,n,0,s.size()-1,list);
    }

    private static ArrayList<String>listLenghthListHelp(List<String> s, int n,int low,int high,ArrayList<String>newlist){


        if (low == high) {
            if (s.get(low).length() == n) {
                newlist.add(s.get(low));
            }

        } else {
            int mid = (low + high) / 2;
            listLenghthListHelp(s, n, low, mid,newlist);
            listLenghthListHelp(s, n, mid + 1, high,newlist);

        }
        return newlist;
    }
}

