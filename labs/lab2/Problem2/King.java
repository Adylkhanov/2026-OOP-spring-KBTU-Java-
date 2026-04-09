public class King extends Piece {

    public King(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return Math.abs(a.row - b.row) <= 1 &&
               Math.abs(a.col - b.col) <= 1;
    }

    @Override
    public char getSymbol() {
        if (this.color == Color.WHILE){
            return 'K';
        }
        return 'k';
        
    }
}