public class Queen extends Piece {

    public Queen(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {

        boolean rookMove = a.row == b.row || a.col == b.col;
        boolean bishopMove = Math.abs(a.row - b.row) == Math.abs(a.col - b.col);

        return rookMove || bishopMove;
    }

    @Override
    public char getSymbol() {
        if (this.color == Color.WHILE){
            return 'Q';
        }
        return 'q';
        
    }
}