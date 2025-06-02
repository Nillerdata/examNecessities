package LamdaUdtryk.src.opgave;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Opgave_20_21_s_836 {

    /*
    (Use Comparator) Write the following generic method using selection sort
and a comparator:
public static <E> void selectionSort(E[] list,
 Comparator<? super E> comparator)
Write a test program that prompts the user to enter six strings, invokes the sort
method to sort the six strings by their last character, and displays the sorted strings.
Use Scanner’s next() method to read a string.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompt bruger til at skrive 6 stings



        String[] liste ={"Hej","sådan","Davs"};


        selectionSort(liste, (e1,e2) -> e1.charAt(e1.length()-1)-e2.charAt(e2.length()-1));
        System.out.println(Arrays.toString(liste));
    }

    public static<E> void selectionSort(E[]list, Comparator<? super  E> comparator){
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (comparator.compare(list[j],list[minPos]) <0) {
                    minPos = j;
                }

            }
            swap(list, i, minPos);
        }
    }

    private static<E> void swap(E[] list, int i, int j) {
        E temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
