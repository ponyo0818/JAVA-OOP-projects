/**
 * King Queen Rock Bishop Knight Pawn
 */
public class Piece{
    String name;
    Position position;
    int row = position.row;
    int column = position.column;

    boolean isValidMove(Position newPosition){
        if(newPosition.row>0 && newPosition.column>0
                && newPosition.row<8 && newPosition.column<8){
            return true;
        }
        else{
            return false;
        }
    }
    public void makeMove (Position newPosition){
        position = newPosition;
    }
}