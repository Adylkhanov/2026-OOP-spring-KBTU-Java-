public abstract class Piece {
    Position a;
    Color color;

    public Piece(Position a, Color color) {
        this.a = a;
        this.color = color;
    }

    public abstract boolean isLegalMove(Position b);

    public Position getPosition() {
        return a;
    }

    public void setPosition(Position a) {
        this.a = a;
    }

    public Color getColor() {
        return color;
    }


    public abstract char getSymbol();

    public void gotEaten(){
        
    }
}