package Practice.Practice3.Problem2;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Person> peoples = new Vector<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Staff");
            System.out.println("3. Show all");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter programm: ");
                String programm = sc.nextLine();
                System.out.println("Enter year: ");
                int year = sc.nextInt();
                System.out.println("Enter fee: ");
                double fee = sc.nextDouble();

                Student student = new Student(name, address, programm, year, fee);
                peoples.add(student);
            } else if (choice == 2) {
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter school: ");
                String school = sc.nextLine();
                System.out.println("Enter pay: ");
                double pay = sc.nextDouble();

                Staff staff = new Staff(name, address, school, pay);
                peoples.add(staff);
            } else if (choice == 3) {
                for (Person person : peoples) {
                    System.out.println(person.toString());
                }
            } else if (choice == 4) {
                break;
            }
        }

        sc.close();
        

    }

}
