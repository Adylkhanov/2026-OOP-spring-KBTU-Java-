public class Pawn extends Piece {

    public Pawn(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return b.col == a.col && b.row == a.row + 1;
    }

    @Override
    public char getSymbol() {
        if (this.color == Color.WHILE) {
            return 'P';
        }
        return 'p';

    }
}