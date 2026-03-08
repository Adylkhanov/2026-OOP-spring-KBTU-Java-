package labs.lab2.Problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {

    private List<Person> people;

    public PersonRegistry() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person p){
        people.add(p);
    }

    public void removePerson(Person p){
        people.remove(p);
    }

    public List<Person> findPeopleWithoutPets(){
        List <Person> result = new ArrayList<>();
        for (Person p : people){
            if ((!p.hasPet())) result.add(p);
        }
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Registry Details:\n");
        for (Person p : people) {
            sb.append(p.toString()).append(" (").append(p.getOccupation()).append(")\n");
        }
        return sb.toString();

    }



    
}
