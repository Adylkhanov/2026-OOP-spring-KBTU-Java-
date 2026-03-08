public class Board {
    private Piece[][] grid = new Piece[8][8];

    public Board() {
        setupBoard();
    }
    public void draw() {
    System.out.println("   0  1  2  3  4  5  6  7");
    for (int i = 0; i < 8; i++) {
        System.out.print(i + " ");
        for (int j = 0; j < 8; j++) {
            Piece p = grid[i][j];
            if (p == null) {
                System.out.print("[ ]");
            } else {
                char symbol = p.getClass().getSimpleName().charAt(0);
                // Белые — заглавные, черные — строчные
                symbol = p.isWhite ? Character.toUpperCase(symbol) : Character.toLowerCase(symbol);
                System.out.print("[" + symbol + "]");
            }
        }
        System.out.println();
    }
}

    private void setupBoard() {
       
        grid[0][0] = new Rook(new Position(0, 0), true);
        grid[0][7] = new Rook(new Position(0, 7), true);
        grid[0][1] = new Horse(new Position(0, 1), true);
        grid[0][6] = new Horse(new Position(0, 6), true);
        grid[0][2] = new Bishop(new Position(0, 2), true);
        grid[0][5] = new Bishop(new Position(0, 5), true);
        grid[0][3] = new Queen(new Position(0, 3), true);
        grid[0][4] = new King(new Position(0, 4), true);
        for (int i = 0; i < 8; i++) grid[1][i] = new Pawn(new Position(1, i), true);

    
        grid[7][0] = new Rook(new Position(7, 0), false);
        grid[7][7] = new Rook(new Position(7, 7), false);
        grid[7][1] = new Horse(new Position(7, 1), false);
        grid[7][6] = new Horse(new Position(7, 6), false);
        grid[7][2] = new Bishop(new Position(7, 2), false);
        grid[7][5] = new Bishop(new Position(7, 5), false);
        grid[7][3] = new Queen(new Position(7, 3), false);
        grid[7][4] = new King(new Position(7, 4), false);
        for (int i = 0; i < 8; i++) grid[6][i] = new Pawn(new Position(6, i), false);
    }

    private boolean isPathClear(int x1, int y1, int x2, int y2) {
        int dx = Integer.compare(x2, x1); // Возвращает 1, -1 или 0
        int dy = Integer.compare(y2, y1);

        int currX = x1 + dx;
        int currY = y1 + dy;

        while (currX != x2 || currY != y2) {
                  if (grid[currX][currY] != null) return false;
                    currX += dx;
                    currY += dy;
    }
    return true;
}

public boolean movePiece(int x1, int y1, int x2, int y2) {
    // 1. Проверка границ доски
    if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7 || x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7) return false;

    Piece p = grid[x1][y1];
    if (p == null) return false;

    // 2. Проверка: ходит ли фигура по своим правилам?
    if (!p.isLegalMove(new Position(x2, y2))) return false;

    // 3. Проверка: свободен ли путь? (Конь игнорирует эту проверку)
    if (!(p instanceof Horse) && !isPathClear(x1, y1, x2, y2)) return false;

    // 4. Выполнение хода
    grid[x2][y2] = p;
    grid[x1][y1] = null;
    p.a = new Position(x2, y2);

    
    return true;
}
}