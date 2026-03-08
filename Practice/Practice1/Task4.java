package Practice1;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter three numbers:");
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();

        int d = (b * b) - (4 * a * c);

        if (d > 0) {
            System.out.println("Two real roots");
            int x1, x2;
            x1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (d == 0) {
            System.out.println("One real root");
            int x;
            x = (int) (-b / (2 * a));
            System.out.println("x: " + x);
        } else {
            System.out.println("No real roots");
        }

        sc.close();

    }

}
