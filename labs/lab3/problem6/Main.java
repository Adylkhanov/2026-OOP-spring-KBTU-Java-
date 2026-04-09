package labs.lab3.problem6;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("ALISHER", 19);
        Dog d1 = new Dog("Akbas", 3);

        s1.assignPet(d1);
        s1.move();
        d1.eat("Meat");

        Student s2 = (Student) s1.clone();
        System.out.println("Are they same objects? " + (s1 == s2));
    }
}
