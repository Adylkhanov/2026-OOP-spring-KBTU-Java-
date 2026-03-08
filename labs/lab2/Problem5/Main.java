package labs.lab2.Problem5;

public class Main {

    public static void main(String[] args) {
        Person alisher = new Employee("Alisher", 19, 10000, "Senior ML");
        Person anelya = new Student("Anelya", 19, 3.5, "Management", "MNU");

        Animal pikachu = new Pikachu("Pika", 1);
        alisher.assignPet(pikachu);

        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(alisher);
        registry.addPerson(anelya);

        alisher.leavePetWith(anelya);

        System.out.println(registry);

        alisher.retrivePetFrom(anelya);

        System.out.println(registry);

    }

}
