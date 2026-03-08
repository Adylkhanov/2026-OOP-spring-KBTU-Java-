public abstract class Piece {
    Position a;
    boolean isWhite; 

    public Piece(Position a, boolean isWhite) {
        this.a = a;
        this.isWhite = isWhite;
    }

    public abstract boolean isLegalMove(Position b);
}