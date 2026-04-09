package labs.lab3.problem5;

import labs.lab3.problem4.Employee;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers", 55.0),
                new Chocolate("Mars", 45.0)
        };
        Sort.bubbleSort(chocolates);
        System.out.println("Sorted Chocolates: ");
        printArray(chocolates);

        Time[] times = {
                new Time(23, 59, 59),
                new Time(12, 30, 0),
                new Time(12, 0, 0)
        };
        Sort.bubbleSort(times);
        System.out.println("\nSorted Times: ");
        printArray(times);

        Date date1 = new Date(120, 5, 15);
        Date date2 = new Date(122, 2, 10);
        Date date3 = new Date(118, 10, 20);

        Employee Neymar = new Employee("Neymar", "Junior UX Designer", 100000, "SN10", date1);
        Employee Ronaldo = new Employee("Ronaldo", "Junior Back-end Developer", 70000, "CR7", date3);
        Employee Messi = new Employee("Messi", "Junior Front-end Developer", 50000, "LM10", date2);

        Employee[] employees = {
                Neymar,
                Ronaldo,
                Messi
        };
        Sort.bubbleSort(employees);
        System.out.println("\nSorted Employees: ");
        printArray(employees);
    }

    static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}