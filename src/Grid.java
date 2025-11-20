package src;

public class Grid {
    
    public static int MAX_SCORE = 4;
    public static int ROW = 8;
    public static int COLUMN = 9;

    
    private String[][] grid = new String[ROW][COLUMN];

    public Grid() {
        for (int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMN; j++){
                grid[i][j] = " ";
            }
        }
    }
    
    public boolean isColumnFull(int column){
        if (grid[7][column].equals("X") || grid[7][column].equals("O")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void placePiece(int column, String piece) {
        if (!isColumnFull(column)) {
            for (int i = 0; i < ROW; i++) {
                if (grid[ROW][column].equals(" ")) {
                    grid[ROW][column] = piece;
                    break;
                }
            }
        }
    }

    public String toString() {
        String fullGrid = "";
        for (int i = ROW-1; i >= 0; i--){
            for(int j = 1; j < COLUMN; j++){
                fullGrid += "[" + grid[i][j] + "]";
            }
            fullGrid += "\n";
        }
        return fullGrid;
    }
    
    public static boolean isFull() {

    }

    public static void displayBoard() {
    }

    public static boolean validColumn(int columns){
    }
    
    
}


