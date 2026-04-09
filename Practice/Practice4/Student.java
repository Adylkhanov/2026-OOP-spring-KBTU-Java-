package Practice.Practice4;

public class Student extends Person implements CanHavePizza, CanHaveParty, Movable, Comparable<Student> {
    
    Student(String name, double gpa) {
        super(name, gpa);
    }

    @Override
    public void eatPizza() { System.out.println(name + " ест пиццу."); }

    @Override
    public void move() { System.out.println(name + " идет на пары."); }

    @Override
    public void dance() { System.out.println(name + " танцует на вечеринке."); }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }
}