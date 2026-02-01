import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double initialBalance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();

        double interestAmount = initialBalance * (interestRate / 100);
        double newBalance = initialBalance + interestAmount;

        System.out.println("Initial balance: " + initialBalance);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Interest added: " + interestAmount);
        System.out.println("New balance: " + newBalance);


        scanner.close();

    }

}
