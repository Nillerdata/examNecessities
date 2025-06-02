package DobbeltArrays.src.opgave3_opgaver;

public class Opgave_8_2 {
    public static void main(String[] args) {
        double[][] values = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println(averageMajorDiagonal(values));
    }

    public static double averageMajorDiagonal(double[][] m){
        double sum = 0;

        for(int row = 0; row < m.length; row++){
           sum += m[row][row];
        }
        return sum /m.length;
    }
}
