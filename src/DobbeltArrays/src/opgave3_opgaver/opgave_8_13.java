package DobbeltArrays.src.opgave3_opgaver;

import java.util.Arrays;
import java.util.Scanner;

public class opgave_8_13 {
    public static int[] locateSmallest(double[][] a) {
        int[] locateSmallest = new int[2];
        double mindste = Integer.MAX_VALUE;

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (mindste > a[row][col]) {
                    mindste = a[row][col];
                    locateSmallest[0] = row;
                    locateSmallest[1] = col;
                }
            }
        }
        return locateSmallest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = scan.nextInt();
        System.out.println("enter number of columns");
        int col = scan.nextInt();

        System.out.println("enter the array");
        double[][] values = new double[row][col];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.println("enter double");
                values[i][j] = scan.nextDouble();
            }
        }
        scan.close();
        System.out.println(Arrays.deepToString(values));
        System.out.println(Arrays.toString(locateSmallest(values)));

    }
}
