public class Rock extends Piece{
    public Rock(){
        super(); // this will call the parent's constructor
        this.name = "rock";
    }
    boolean isValidMove(Position newPosition){
        // First call the parent's method to check for the board bounds
        if(!super.isValidMove(position)){
            return false;
        }
        // If we passed the first test then check for the specific rock movement
        if(newPosition.column == this.column || newPosition.row == this.row){
            return true;
        }
        else{
            return false;
        }
    }
}