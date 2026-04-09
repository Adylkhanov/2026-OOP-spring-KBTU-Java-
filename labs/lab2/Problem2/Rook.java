public class Rook extends Piece {

    public Rook(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.row == b.row || a.col == b.col;
    }

    @Override
    public char getSymbol() {
        if (this.color == Color.WHILE){
            return 'R';
        }
        return 'r';
        
    }
}