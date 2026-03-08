package labs.lab2.Problem5;

public class Employee extends Person {

    private int salary;
    private String job;

    public Employee(String name, int age, int salary, String job){
        super(name, age);
        this.salary = salary;
        this.job = job;
    }

    @Override
    public String getOccupation() {
        return "Working as a " + job +
                "and got a salary:" + salary;
    }


    
}
