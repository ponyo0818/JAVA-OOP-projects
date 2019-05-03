public class Game{
    Piece [][] board;
    // Constructor creates an empty board
    Game(){
        board = new Piece[8][8];
    }
    public static void main (String [] args)
    {
        Queen queen = new Queen();
        Position testPosition = new Position(3, 10);
        if (queen.isValidMove(testPosition)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }
    }
}