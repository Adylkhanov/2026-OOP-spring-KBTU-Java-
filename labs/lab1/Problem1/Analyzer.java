package labs.lab1.Problem1;
import java.util.Scanner;

public class Analyzer {

    private static final String QUIT_COMMAND = "Q";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase(QUIT_COMMAND)) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a number or Q to quit.");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

        scanner.close();
    }
}
