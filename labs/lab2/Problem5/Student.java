package labs.lab2.Problem5;

public class Student extends Person {

    private String major;
    private double gpa;
    private String colleage;
    
    public Student(String name, int age, double gpa, String major, String colleage){
        super(name, age);
        this.gpa = gpa;
        this.major = major;
        this.colleage = colleage;
    }

    @Override 
    public String getOccupation(){
        return "My major is " + major +
                "Gpa is " + gpa +
                "Studying at " + colleage;
    }

    
}
