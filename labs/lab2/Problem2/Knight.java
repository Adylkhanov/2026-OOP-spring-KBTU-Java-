public class Knight extends Piece {

    public Knight(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int dx = Math.abs(a.row - b.row);
        int dy = Math.abs(a.col - b.col);

        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }


    @Override
    public char getSymbol() {
        if (this.color == Color.WHILE) {
            return 'H';
        }
        return 'h';

    }
}