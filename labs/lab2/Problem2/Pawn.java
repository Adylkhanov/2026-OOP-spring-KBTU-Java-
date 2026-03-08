public class Pawn extends Piece {
    public Pawn(Position a, boolean isWhite) { super(a, isWhite); }

    @Override
    public boolean isLegalMove(Position b) {
        int direction = isWhite ? -1 : 1; 
        
  
        if (a.y == b.y && b.x - a.x == direction) {
            return true;
        }
       
        int startRow = isWhite ? 6 : 1;
        if (a.x == startRow && a.y == b.y && b.x - a.x == 2 * direction) {
            return true;
        }
        return false;
    }
}