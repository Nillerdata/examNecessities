/*
 * Created on 2005-03-03
 */
package Rekursion_2.src.maze;

public class Maze {

    // 1 betyder der er en vej
    // 0 betyder spærret
    // 2 markere at man har været der tidligere og der var vej
    // 3 markere at det er en del af vejen gennem labyrinten

     private int[][] grid = {{1,1,1,0,1,1,0,0,0,1,1,1,1},
     {1,0,1,1,1,0,1,1,1,1,0,0,1},
     {0,0,0,0,1,0,1,0,1,0,1,0,0},
     {1,1,1,0,1,1,1,0,1,0,1,1,1},
     {1,0,1,0,0,0,0,1,1,1,0,0,1},
     {1,0,1,1,1,1,1,1,0,1,1,1,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0},
     {1,1,1,1,1,1,1,1,1,1,1,1,1}} ;

//    private int[][] grid = {{1, 1, 0, 0, 1},
//                            {0, 1, 1, 1, 0},
//                            {0, 1, 0, 1, 1},
//                            {1, 1, 0, 0, 1}};

    private final int TRIED = 2;
    private final int PATH = 3;

    public void tryPosition(int row, int col) {
        grid[row][col] = TRIED;

    }

    public void markPath(int row, int col) {
        grid[row][col] = PATH;
    }


    // Return number of rows
    public int getRows() {
        // TODO
        return grid.length;
    }

    // Return number of columns
    public int getCols() {
        // TODO
        return grid[0].length;
    }

    // metoden returnerer true hvis det er inden for labyrinten og der er en vej
    public boolean validPosistion(int row, int column) {
       //TODO
        // Check if row and column are within bounds
        if (row < 0 || row >= getRows() || column < 0 || column >= getCols()) {
            return false;
        }

        // Check if the position is a valid path (1)
        return grid[row][column] == 1;
    }

    @Override
    public String toString() {
        String result = "\n";
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                result += grid[row][column] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
