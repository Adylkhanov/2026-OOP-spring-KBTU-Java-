package Practice.Practice2;

public class Task1 {

    public static void main(String[] args) {

        Student student1 = new Student("wfhwuif",5);

        System.out.println(student1.toString());

        student1.incrementYear();

        System.out.println("After incrementing year of study:");
        System.out.println(student1.toString());

        System.out.println("Name: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Year of Study: " + student1.getYearofstudy());

    }

}

