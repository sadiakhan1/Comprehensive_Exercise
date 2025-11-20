package src;

public class Player {
    
    public static final String PLAYER_ONE = "X";
    public static final String PLAYER_TWO = "O";

    //instance variables
    private String playerOne;
    private String playerTwo;
    private int points;
    private int totalPieces;

    
    //constructors
    public Player() {
        this.playerOne = PLAYER_ONE;
        this.playerTwo = PLAYER_TWO;

        
    } 

    //methods

    public String getPlayerOne(){
        return playerOne;
    }

    public String getPlayerTwo(){
        return playerTwo;
    }

    public int getTotalPieces() {
        return totalPieces;
    }


    public void addPoints() {
        this.points += 1;
    }

}
