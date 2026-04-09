package labs.lab3.problem6;

public abstract class Animal implements Cloneable, canEat {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " the animal is eating " + food);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract String getSound();
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Name " + name +
                "age " + age + 
                "Type " + this.getClass(); 
    }
}