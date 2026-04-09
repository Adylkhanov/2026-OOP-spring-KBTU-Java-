package Practice.Practice4;

class Cat extends Animal implements CanHavePizza {
    @Override
    public void eatPizza() {
        System.out.println("Офигевший Кот жрет пиццу.");
    }
}