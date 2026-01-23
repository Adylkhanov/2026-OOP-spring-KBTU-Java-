public class Task5 {
    public static void main(String[] args) {

        double initialBalance = 1000.0;
        double interestRate = 5.0;

        double interestAmount = initialBalance * (interestRate / 100);
        double newBalance = initialBalance + interestAmount;

        System.out.println("Initial balance: " + initialBalance);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Interest added: " + interestAmount);
        System.out.println("New balance: " + newBalance);

    }

}
