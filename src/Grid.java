package src;

public 
public class Grid {
    
    public static int MAX_SCORE = 4;
    public static int ROW = 8;
    public static int COLUMN = 9;

    
    private String[][] grid = new String[ROW][COLUMN];

    public Grid() {
        for (int i = 0; i <= ROW; i++){
            for(int j = 0; j <= COLUMN; j++){
                grid[i][j] = " ";
            }
        }
    }
    
    // public String getGrid(){
    //     return fullGrid;
    // }

    public String displayBoard() {
        
    }

    public String toString() {
        String fullGrid = "";
        for (int i = ROW-1; i >= 0; i--){
            for(int j = 1; j < COLUMN; j++){
                fullGrid += grid[i][j];
            }
            fullGrid += "\n";
        }
        return fullGrid;
    }
    
}


