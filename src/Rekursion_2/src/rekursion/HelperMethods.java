package Rekursion_2.src.rekursion;

import java.util.ArrayList;

public class HelperMethods {
    public static int sum1(ArrayList<Integer> list) {
        int result;
        if (list.size() == 0) {
            result = 0;
        } else {
            result = list.get(0);
            list.remove(0);
            result = result + sum1(list);
        }
        return result;
    }

    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0);
    }

    // Rekursiv hjælpemetode med de nødvendige parametre

    private static int sum(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = list.get(index) + sum(list, index + 1);
        }
        return result;
    }

    public static int length(ArrayList<Integer> list) {
        return length(list, 0);

    }

    // Rekursiv hjælpemetode med de nødvendige parametre
    private static int length(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = 1 + length(list, index + 1);
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(10);
        list.add(17);
        list.add(4);
        list.add(8);
        list.add(45);
        list.add(29);
        System.out.println(list);
        int[] arr = {4, 5, 8, 24, 25, 30, 45, 56, 70};

//        System.out.println(binarySearchRekursion(arr, 25));
//        System.out.println(ackermann(1, 3));

//		System.out.println("sum: " + sum1(list));
//		System.out.println("length: " + length(list));

//        System.out.println(list);
//        System.out.println(ligeTal(list));
//        System.out.println(ligeTalMedHjælp(list));
//        System.out.println(palindrom("abba"));
//        System.out.println(binomial(7, 1));
//        flyt(3,1,3);
//        System.out.println(antalFlytninger);
        System.out.println(talrække(3));
        System.out.println(iterativTalrække(3));

    }

    //opgave 1 uden hjælp
    public static int ligeTal(ArrayList<Integer> list) {
        int ligetal = 0;

        if (list.size() == 0) {
            ligetal = 0;
        } else {
            if (list.get(0) % 2 == 0) {
                ligetal++;
            }
            list.remove(0);
            ligetal = ligetal + ligeTal(list);

        }

        return ligetal;
    }

    //opgave 1 med hjælp
    private static int opgave1Hjælp(ArrayList<Integer> list, int index) {
        int ligetal = 0;

        if (index == list.size()) {
            ligetal = 0;
        } else {
            if (list.get(index) % 2 == 0) {
                ligetal++;
            }

            ligetal = ligetal + opgave1Hjælp(list, index + 1);

        }

        return ligetal;
    }

    public static int ligeTalMedHjælp(ArrayList<Integer> list) {

        return opgave1Hjælp(list, 0);
    }

    //---------------------------------------------------------
    public static boolean palindrom(String tekst) {

        return palindromHjælp(tekst, 0, tekst.length() - 1);
    }

    private static boolean palindromHjælp(String tekst, int low, int high) {
        boolean isPalindrom;
        if (low >= high) {
            isPalindrom = true;

        } else {
            if (tekst.charAt(low) != tekst.charAt(high)) {
                return false;

            } else {
                return palindromHjælp(tekst, low + 1, high - 1);
            }

        }
        return isPalindrom;
    }


    public static boolean binarySearchRekursion(int[] arr, int target) {
        int low = arr[0];
        int high = arr.length - 1;
        return binarySearchHjælp(arr, target, low, high);
    }

    //opgave 3
    private static boolean binarySearchHjælp(int[] arr, int target, int low, int high) {

        if (low > high) {
            return false;
        }
        int mid = (low + high) / 2;
        if (target == arr[mid]) {
            return true;
        }
        if (target < arr[mid]) {
            return binarySearchHjælp(arr, target, low, mid - 1);
        } else
            return binarySearchHjælp(arr, target, mid + 1, high);
    }

    //opgave 4
    public static int ackermann(int x, int y) {
        int result = 0;

        if (x == 0 && y == 0) {
            result = -1;
        } else if (x == 0) {
            result = y + 1;
        } else if (y == 0) {
            result = ackermann(x - 1, 1);
        } else {
            int temp = ackermann(x, y - 1);

            result = ackermann(x - 1, temp);

        }
        return result;
    }

    //opgave 5
    public static int binomial(int n, int m) {

        if (m == 0 || m == n) {
            return 1;
        } else {
            return binomial(n - 1, m) + binomial(n - 1, m - 1);
        }

    }

    //opgave 6
    public static int antalFlytninger = 0;

    public static void flyt(int n, int fra, int til) {
        if (n == 1) {

            System.out.println("Flyt fra " + fra + " til " + til);
            antalFlytninger++;
        } else {

            int temp = 6 - fra - til;
            flyt(n - 1, fra, temp);
            antalFlytninger++;

            System.out.println("Flyt fra " + fra + " til " + til);
            flyt(n - 1, temp, til);
        }
    }

    //opgave 7
    public static int talrække(int n) {


        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        }

        int midlertidig = talrække(n - 1);
        int temp = talrække(n - 3);

        if (n > 2 && n % 2 == 0) {
            return 2 * temp - midlertidig;

        } else if (n > 2 && n % 2 != 0) {

            int temp1 = talrække(n - 2);


            return midlertidig + temp1 + 3 * temp;
        }
        return 0;
    }

    public static int iterativTalrække(int n) {

        int[] tal = new int[n + 1];
        tal[0] = 2;
        tal[1] = 1;
        tal[2] = 5;

        for (int i = 3; i < tal.length; i++) {
            if (i % 2 == 0) {
                tal[i] = 2 * tal[i - 3] - tal[i - 1];
            } else {
                tal[i] = tal[i - 1] + tal[i - 2] + 3 * tal[i - 3];
            }
        }
        return tal[n];
    }
}






