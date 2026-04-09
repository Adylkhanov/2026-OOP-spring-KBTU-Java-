public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initialize();
    }

    private void initialize() {
        
        board[0][0] = new Rook(new Position(0, 0), Color.WHILE);
        board[0][1] = new Knight(new Position(0, 1), Color.WHILE);
        board[0][2] = new Bishop(new Position(0, 2), Color.WHILE);
        board[0][3] = new Queen(new Position(0, 3), Color.WHILE);
        board[0][4] = new King(new Position(0, 4), Color.WHILE);
        board[0][5] = new Bishop(new Position(0, 5), Color.WHILE);
        board[0][6] = new Knight(new Position(0, 6), Color.WHILE);
        board[0][7] = new Rook(new Position(0, 7), Color.WHILE);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1, i), Color.WHILE);
        }

       
        board[7][0] = new Rook(new Position(7, 0), Color.BLACK);
        board[7][1] = new Knight(new Position(7, 1), Color.BLACK);
        board[7][2] = new Bishop(new Position(7, 2), Color.BLACK);
        board[7][3] = new Queen(new Position(7, 3), Color.BLACK);
        board[7][4] = new King(new Position(7, 4), Color.BLACK);
        board[7][5] = new Bishop(new Position(7, 5), Color.BLACK);
        board[7][6] = new Knight(new Position(7, 6), Color.BLACK);
        board[7][7] = new Rook(new Position(7, 7), Color.BLACK);

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(new Position(6, i), Color.BLACK);
        }
    }

    public void printBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    private boolean isInside(Position p) {
        return p.row >= 0 && p.row < 8 && p.col >= 0 && p.col < 8;
    }

    public boolean move(Position from, Position to) {
        if (!isInside(from) || !isInside(to)) {
            System.out.println("Out of board!");
            return false;
        }

        Piece piece = board[from.row][from.col];

        if (piece == null) {
            System.out.println("No piece at starting position!");
            return false;
        }

        if (!piece.isLegalMove(to)) {
            System.out.println("Illegal move for this piece!");
            return false;
        }

        Piece target = board[to.row][to.col];

        if (target != null && target.getColor() == piece.getColor()) {
            System.out.println("You cannot capture your own piece!");
            return false;
        }

        board[to.row][to.col] = piece;
        board[from.row][from.col] = null;
        piece.setPosition(to);

        return true;
    }
}