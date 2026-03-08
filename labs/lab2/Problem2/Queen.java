public class Queen extends Piece {
    public Queen(Position a,  boolean isWhite) { super(a, isWhite); }

    @Override
    public boolean isLegalMove(Position b) {
        return (a.x == b.x || a.y == b.y) || (Math.abs(a.x - b.x) == Math.abs(a.y - b.y));
    }
} 
