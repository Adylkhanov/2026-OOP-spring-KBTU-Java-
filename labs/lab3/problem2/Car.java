package labs.lab3.problem2;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("Машина едет");
    }

}

class Plane implements Flyable {
    @Override
    public void move() {
        System.out.println("OFIGET SAMOLET DVIZHETSYA PO ZEMLE YOU");
    }

    @Override
    public void fly() {
        System.out.println("SAMOLET LETIT PO NEBU KRASIVO;)");
    }
}
