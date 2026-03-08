package labs.lab1.Problem4;

import Practice.Practice2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private List<Integer> grades; 
    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public GradeBook(Course course, List<Student> students) {
        this(course);
        for (Student s : students) addStudent(s);
    }

    public void addStudent(Student s) {
        students.add(s);
        grades.add(null); 
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
        System.out.println(course.getDescription());
        System.out.println();
    }

    public void inputGrades(Scanner sc) {
        System.out.println("Please, input grades for students:\n");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            int g = readGrade(sc, s.getName());
            grades.set(i, g);
        }
        System.out.println();
    }

    private int readGrade(Scanner sc, String studentName) {
        while (true) {
            System.out.print("Student " + studentName + ": ");
            String line = sc.nextLine().trim();

            try {
                int g = Integer.parseInt(line);
                if (g < 0 || g > 100) {
                    System.out.println("Grade must be from 0 to 100. Try again.");
                    continue;
                }
                return g;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer grade (0..100).");
            }
        }
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        int min = getMinimum();
        int max = getMaximum();

        int minIndex = indexOf(min);
        int maxIndex = indexOf(max);

        System.out.printf("Class average is %.2f. Lowest grade is %d (%s, id: %d).%n",
                avg, min, students.get(minIndex).getName(), students.get(minIndex).getId());

        System.out.printf("Highest grade is %d (%s, id:%d).%n%n",
                max, students.get(maxIndex).getName(), students.get(maxIndex).getId());

        outputBarChart();
    }

    public double determineClassAverage() {
        int sum = 0;
        int cnt = 0;

        for (Integer g : grades) {
            if (g == null) continue;
            sum += g;
            cnt++;
        }
        return (cnt == 0) ? 0.0 : (double) sum / cnt;
    }

    public int getMinimum() {
        int min = Integer.MAX_VALUE;
        for (Integer g : grades) {
            if (g == null) continue;
            if (g < min) min = g;
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    public int getMaximum() {
        int max = Integer.MIN_VALUE;
        for (Integer g : grades) {
            if (g == null) continue;
            if (g > max) max = g;
        }
        return (max == Integer.MIN_VALUE) ? 0 : max;
    }

    private int indexOf(int grade) {
        for (int i = 0; i < grades.size(); i++) {
            Integer g = grades.get(i);
            if (g != null && g == grade) return i;
        }
        return 0;
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");

        int[] freq = new int[11]; 

        for (Integer g : grades) {
            if (g == null) continue;
            int bucket = (g == 100) ? 10 : g / 10;
            freq[bucket]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                int start = i * 10;
                int end = i * 10 + 9;
                System.out.printf("%02d-%02d: ", start, end);
            }

            for (int star = 0; star < freq[i]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students.size() + "}";
    }
}
