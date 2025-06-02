package DobbeltArrays.src.opgave4Teater;

import java.util.Arrays;

public class TheaterFloor {
    int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20}, {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};

    /**
     * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
     * Der returneres false hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */

    public boolean buySeat(int row, int seat) {
        // TODO
        boolean bought = false;
        if(seats[row][seat] != 0){
            seats[row][seat] = 0;
            bought = true;
        }


        return bought;
    }

    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public boolean buySeat(int price) {
        // TODO
        boolean ledig = false;

        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == price) {
                    ledig = true;
                    seats[row][col] = 0;
                }
            }
        }

        return ledig;

    }

    public void printTheaterFloor() {
    int[] sæde = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9,10};
//    int[] række = {1,2,3,4,5,6,7,8,9};

        System.out.println("----------------------------------------");

        for (int i = 0; i < sæde.length; i++) {
            System.out.print("sæde"sæde[i] + "  ");
        }
        for(int row = 0; row<seats.length; row++){
            System.out.println();
            System.out.print("række " + sæde[row] + ": ");
            for (int col = 0; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
        }
        // TODO
    }
}
