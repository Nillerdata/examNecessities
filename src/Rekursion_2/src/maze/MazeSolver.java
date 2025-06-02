package Rekursion_2.src.maze;

public class MazeSolver {
    private Maze maze;

    public MazeSolver(Maze maze) {
        this.maze = maze;

    }

    // Rekursiv metode der afgør om der findes vej gemmen labyrinten
    public boolean traverse(int row, int column) {
        boolean done = false;
       if(row<0 || row >= maze.getRows() || column <0 || column >= maze.getCols()){
           done = false;
       }
       if(!maze.validPosistion(row,column)){
           return false;
       }
       //check if we reached the exit(bottom right corner)
        if(row== maze.getRows() -1 && column == maze.getCols()-1){
            maze.markPath(row,column);
            return true;
        }
        //mark position as tried.
        maze.tryPosition(row,column);

        // Try moving in all directions (right, down, left, up)
        if (traverse(row, column + 1) ||  // Right
                traverse(row + 1, column) ||  // Down
                traverse(row, column - 1) ||  // Left
                traverse(row - 1, column)) {  // Up
            maze.markPath(row, column);   // Mark as part of the correct path
            return true;
        }

        return false;  // No path found
       // TODO

    }
    /*
    Explanation:
We first check if the current position is valid.
If we reach the bottom-right corner, we mark it as part of the path and return true.
Otherwise, we mark the position as tried and try moving right, down, left, and up recursively.
If any move leads to the exit, we mark this position as part of the path.
If no valid move exists, we return false.
     */
}
