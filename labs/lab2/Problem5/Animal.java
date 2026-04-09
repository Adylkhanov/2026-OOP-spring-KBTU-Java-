package labs.lab2.Problem5;

public abstract class Animal {
    private String name;
    private int age;

   public Animal(String name, int age){
        this.name = name;
        this.age = age;
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
