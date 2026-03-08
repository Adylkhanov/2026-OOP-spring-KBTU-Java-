package Practice.Practice3.Problem2;

public class Person {

    private String name;
    private String addres;


    public Person (String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }
    
    
}
