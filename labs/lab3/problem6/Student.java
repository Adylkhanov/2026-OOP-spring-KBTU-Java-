package labs.lab3.problem6;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getOccupation() {
        return "Student";
    }
}

class Dog extends Animal implements Moveable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof!";
    }

    @Override
    public void move() {
        System.out.println(getName() + " is running!");
    }
}