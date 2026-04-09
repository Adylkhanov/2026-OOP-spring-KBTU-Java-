package Practice.Practice4;

public class Restik {
    void servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
            System.out.println("Процесс оплаты...");
        }
    }

}
