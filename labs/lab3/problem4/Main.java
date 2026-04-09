package labs.lab3.problem4;

import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vector<Employee> staff = new Vector<>();

        Date date1 = new Date(120, 5, 15);
        Date date2 = new Date(122, 2, 10);
        Date date3 = new Date(118, 10, 20);

        Employee Neymar = new Employee("Neymar", "Junior UX Designer", 25000, "SN10", date1);
        Employee Ronaldo = new Employee("Ronaldo", "Junior Back-end Developer", 50000, "CR7", date3);
        Employee Messi = new Employee("Messi", "Junior Front-end Developer", 50000, "LM10", date2);

        staff.add(Messi);
        staff.add(Ronaldo);
        staff.add(Neymar);

        Vector<Employee> team = new Vector<>();
        team.add(Neymar);
        team.add(Ronaldo);
        team.add(Messi);
        Manager boss = new Manager("Alisher", "CEO", 80000, team, "INS003", date1, 10000000);
        staff.add(boss);

        System.out.println("--- Исходный список ---");
        printList(staff);

        System.out.println("\n--- Сортировка по зарплате (Comparable) ---");
        Collections.sort(staff);
        printList(staff);

        System.out.println("\n--- Сортировка по имени (NameComparator) ---");
        Collections.sort(staff, new NameComporator());
        printList(staff);

        System.out.println("\n--- Сортировка по дате приема (HireDateComparator) ---");
        Collections.sort(staff, new HireDateComporator());
        printList(staff);

        System.out.println("\n--- Тест клонирования ---");
        Manager bossClone = (Manager) boss.clone();
        System.out.println("Оригинал: " + boss);
        System.out.println("Клон: " + bossClone);
        System.out.println("boss == bossClone? " + (boss == bossClone)); 
        System.out.println("boss.equals(bossClone)? " + boss.equals(bossClone)); 
    }

    public static void printList(Vector<Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
    }

}
