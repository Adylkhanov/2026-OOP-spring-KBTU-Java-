import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n < 50) {
            System.out.println("F");
        } else if (50 <= n && n <= 54) {
            System.out.println("D");
        } else if (55 <= n && n <= 59) {
            System.out.println("D+");
        } else if (60 <= n && n <= 64) {
            System.out.println("C-");
        } else if (65 <= n && n <= 69) {
            System.out.println("C");
        } else if (70 <= n && n <= 74) {
            System.out.println("C+");
        } else if (75 <= n && n <= 79) {
            System.out.println("B-");
        } else if (80 <= n && n <= 84) {
            System.out.println("B");
        } else if (85 <= n && n <= 89) {
            System.out.println("B+");
        } else if (90 <= n && n <= 94) {
            System.out.println("A-");
        } else if (95 <= n && n <= 100) {
            System.out.println("A");
        }

        scan.close();
    }
}