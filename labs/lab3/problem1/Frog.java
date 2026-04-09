package labs.lab3.problem1;

public class Frog implements Moveable, Jumpable, Swimmable {

    @Override
    public void move() {
        System.out.println("Прыгает");
    }

    @Override
    public void jump() {
        System.out.println("Прыгает");
    }

    @Override
    public void swim() {
        System.out.println("Плавает");
    }
    
}
