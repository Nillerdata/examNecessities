package DobbeltArrays.src.opgave1_2dobbelArray;

public class Opg2DobbelArray {

    public static void udskrivArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        final int ROW = 8;
        final int COL = 8;
        int[][] values = new int[ROW][COL];
//
//        //Udskriv values på tabel form
//       udskrivArray(values);
//

        // TODO Opgave 2.1  lav ændringer i values så der står 5 på alle pladser

//        for (int row = 0; row < values.length; row++) {
//            for (int col = 0; col < values[row].length; col++) {
//                values[row][col] = 5;
//            }
//        }
//
//        udskrivArray(values);
//
        // TODO Opgave 2.2  lav ændringer i values så der står 2 i lige rækker og 3 i ulige
//        for (int row = 0; row < values.length; row++) {
//            for (int col = 0; col < values[row].length; col++) {
//                if(row%2 == 0){
//                    values[row][col] = 2;
//                }
//                else values[row][col] = 3;
//            }
//        }
//
//
//        udskrivArray(values);
//
        // TODO Opgave 2.3  lav ændringer i values så der står 2 i lige søjler og 3 i ulige

//        for (int row = 0; row < values.length; row++) {
//            for (int col = 0; col < values[row].length; col++) {
//                if(col%2 == 0){
//                    values[row][col] = 2;
//                }
//                else values[row][col] = 3;
//            }
//        }
//        udskrivArray(values);
//

        // TODO Opgave 2.4 lav ændringer i values så den har skiftende 0'er og 1'er som på et
        // skakbræt
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                values[row][col] = (row + col) % 2;
            }
        }
        udskrivArray(values);

        /* TODO Opgave 2.5 lav ændringer så alle elementer i nederste og øverste række samt første
            og sidste søjle er 5 og resten skal være 2. */

        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (row == 0 || row == values.length - 1 || col == 0 || col == values.length - 1) {
                    values[row][col] = 5;
                } else values[row][col] = 2;
            }
        }
        udskrivArray(values);
    }
}
