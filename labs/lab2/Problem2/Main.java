import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.draw();
            System.out.println("Введите ход (x1 y1 x2 y2) или 'exit':");
            String input = scanner.nextLine();
            
            if (input.equals("exit")) break;

            String[] parts = input.split(" ");
            int x1 = Integer.parseInt(parts[0]);
            int y1 = Integer.parseInt(parts[1]);
            int x2 = Integer.parseInt(parts[2]);
            int y2 = Integer.parseInt(parts[3]);

            if (board.movePiece(x1, y1, x2, y2)) {
                System.out.println("Ход выполнен!");
            } else {
                System.out.println("Недопустимый ход!");
            }
        }

        scanner.close();
    }
}