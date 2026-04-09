package labs.lab2.Problem5;

public class Main {

    public static void main(String[] args) {
        Person harry = new Employee("Harry Potter", 20, 100000, "Manad security engineer");
        Person ron = new Student("Ron Wisley", 19, 1.488,
                "studying Magic Learning at KMTU(Kazakh - Magical Technical University",
                "MTU(Kazakh - Magic Technical University)");
        Person germiona = new PhDStudent("Germiona Grandjer", 19, "Arcane-magic:", "Dark magic mental influence");

        Animal pikachu = new Pikachu("Pika", 1);
        Animal dogman = new Dog("Rex", 10);

        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(harry);
        registry.addPerson(ron);
        registry.addPerson(germiona);

        harry.assignPet(pikachu);
        harry.leavePetWith(ron);

        System.out.println(registry);

        harry.retrivePetFrom(ron);

        System.out.println(registry);

        germiona.assignPet(dogman);

    }

}
