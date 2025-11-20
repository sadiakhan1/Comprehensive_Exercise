package src;
import java.util.*;

public class ConnectFour {
    public static final int WIN_CONDITION = 4;

    //instance variables
    private String playerOne;
    private String playerTwo;
    private int currentTurn;
    private Grid grid;


    //constructors
    
    //main
    public static void main(String[] args) {
        Player players = new Player();
        this.playerOne = players.getPlayerOne();
        this.playerTwo = players.getPlayerTwo();
        Grid grid = new Grid();
        Scanner scnr = new Scanner(System.in);
        
        while(true) {
            System.out.print(grid);
            System.out.print("Player 1 (X) Choose a column: ");
            int chosenColumn = scnr.nextInt();
            
        }
        
    }

    //methods
    
    
    public static void boolean checkIfWon() {
        if (grid)
        
    }


        public static void boolean checkIfHori() {
        }


        public static void boolean checkVertical() {
        }
        
        public static void boolean checkDiag() {
        }

    


}
