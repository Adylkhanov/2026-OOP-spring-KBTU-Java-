package labs.lab2.Problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) { this.pet = pet; }
    public void removePet() { this.pet = null; }
    public boolean hasPet() { return this.pet != null; }
    public Animal getPet() { return this.pet; }
    public String getName() { return name; }
    public abstract String getOccupation();

    public void leavePetWith(Person o){
        if (o.getClass().equals("PhDStudent") && this.pet.getClass().equals("Dog")){
            System.out.print("Phd cant take the dog bro");
        }
        o.assignPet(this.pet);
        this.removePet();
    }

    public void retrivePetFrom(Person o){
        this.assignPet(o.getPet());
        o.removePet();
    }

    @Override
    public String toString(){
        return "Name: " + name +
                "age: " + age +
                "pet: " + pet;

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if( o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name == person.name && age == person.age && pet == person.pet;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(name, age, pet);
    }
}
