package Practice.Practice3.Problem1;

public class Dragon extends Animal {

    private String name;

    public Dragon(String name) {
        this.name = name;
    }

    public Dragon() {
        this.name = "Unnamed Dragon";
    }

    public void breatheFire() {
        System.out.println("Dragon is breathing fire");
    }

    public void fly() {
        System.out.println("Dragon is flying");
    }

    @Override
    public void poop() {
        System.out.println("Dragon is pooping fire");
    }

    public void testPoop() {
        super.poop();
        this.poop();
    }

    public void Orders(String Orders) {
        if (Orders.equals("Drakaris!")) {
            breatheFire();
        } else if (Orders.equals("fly")) {
            fly();
        } else if (Orders.equals("poop")) {
            poop();
        } else {
            System.out.println("Dragon doesnt know how to " + Orders);
        }

    }

    @Override
    public void whatIsThisEating(String food) {
        System.out.println("Dragon is eating " + food);
    }

    public void whatIsThisEating() {
        System.out.println("Dragon is eating something");
    }

    public void testEat() {
        super.whatIsThisEating("meat");
        this.whatIsThisEating("meat");
        this.whatIsThisEating();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setName("Smaug");
        dragon.breatheFire();
        dragon.fly();
        dragon.poop();
        dragon.whatIsThisEating("meat");
        dragon.Orders("Drakaris!");

    }
}
