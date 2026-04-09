package labs.lab3.problem1;

public class Human extends Eating {
    @Override
    public void eat() {
        System.out.println("Ест руками");
    }
}

class Robot extends Eating {
    @Override
    public void eat() {
        System.out.println("Робот не может есть");
    }
}