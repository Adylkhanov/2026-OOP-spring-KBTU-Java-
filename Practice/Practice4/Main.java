package Practice.Practice4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Restik ronaldo_Samsa = new Restik();
        ronaldo_Samsa.servePizza(new Cat());
        ronaldo_Samsa.servePizza(new Student("Ronaldo", 3.8));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alibek", 3.5));
        students.add(new Student("Zere", 4.0));

        Collections.sort(students);
        Collections.sort(students, new NameComparator());

        int[] numbers = { 1, 2, 3, 4, 1, 1, 4, 5, 2, 1 };
        Sortingut.countingSort(numbers);
    }
}