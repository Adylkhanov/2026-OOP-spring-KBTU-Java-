public class Bishop extends Piece {

    public Bishop(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return Math.abs(a.row - b.row) == Math.abs(a.col - b.col);
    }

    @Override
    public char getSymbol() {
        if (this.color == Color.WHILE) {
            return 'K';
        }
        return 'k';

    }
}