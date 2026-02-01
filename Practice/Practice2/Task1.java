package Practice2;

public class Task1 {

    public static void main(String[] args) {

        Student student1 = new Student(2, 24050475);

        System.out.println(student1.toString());

        student1.incrementYear();

        System.out.println("After incrementing year of study:");
        System.out.println(student1.toString());

        System.out.println("Name: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Year of Study: " + student1.getYearofstudy());

    }

}

class Student {

    private String name;
    private int id;
    private int yearofstudy;

    public Student(int yearofstudy, int id) {
        this.name = "Unknown(Cristiano Ronaldo)";
        this.id = id;
        this.yearofstudy = yearofstudy;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearofstudy() {
        return yearofstudy;
    }

    public void incrementYear() {
        this.yearofstudy++;
    }

    @Override
    public String toString() {
        return "Student{name='" + name +
                "', id=" + id +
                ", yearofstudy=" + yearofstudy + "}";
    }
}
