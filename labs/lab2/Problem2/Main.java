import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner sc = new Scanner(System.in);

        while (true) {
            board.printBoard();

            System.out.println("Enter move: fromRow fromCol toRow toCol");
            System.out.println("Example: 1 0 2 0");
            System.out.print("> ");

            int fr = sc.nextInt();
            int fc = sc.nextInt();
            int tr = sc.nextInt();
            int tc = sc.nextInt();

            Position from = new Position(fr, fc);
            Position to = new Position(tr, tc);

            boolean moved = board.move(from, to);

            if (moved) {
                System.out.println("Move done.");
            } else {
                System.out.println("Move failed.");
            }
        }

    }

}