package labs.lab1.Problem4;
import Practice.Practice2.Student;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        Course course = new Course(
                "CS101 Object-oriented Programming and Design!",
                "Database",
                5,
                "None"
        );

        GradeBook gb = new GradeBook(course);

        
        Student A = new Student("A", 1); A.setId(1);
        Student B = new Student("B", 1); B.setId(4); 
        Student C = new Student("C", 1); C.setId(3);
        Student D = new Student("D", 1); D.setId(87); 
        Student E = new Student("E", 1); E.setId(5);
        Student F = new Student("F", 1); F.setId(6);
        Student G = new Student("G", 1); G.setId(7);
        Student H = new Student("H", 1); H.setId(8);
        Student I = new Student("I", 1); I.setId(9);
        Student J = new Student("J", 1); J.setId(10);

        gb.addStudent(A);
        gb.addStudent(B);
        gb.addStudent(C);
        gb.addStudent(D);
        gb.addStudent(E);
        gb.addStudent(F);
        gb.addStudent(G);
        gb.addStudent(H);
        gb.addStudent(I);
        gb.addStudent(J);

        gb.displayMessage();

        Scanner sc = new Scanner(System.in);
        gb.inputGrades(sc);

        gb.displayGradeReport();
    }
}

    
