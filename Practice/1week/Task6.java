import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String revstr = new StringBuilder(str).reverse().toString();

        if (str.equals(revstr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");

        }

        scanner.close();
    }
}
