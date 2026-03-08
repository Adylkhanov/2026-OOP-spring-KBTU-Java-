package Practice.Practice2;

public class Student {

    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.id = 1;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearofstudy() {
        return yearOfStudy;
    }

    public void incrementYear() {
        this.yearOfStudy++;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setYearofstudy(int yearofstudy){
        this.yearOfStudy = yearofstudy;
    }
  
    public String toString() {
        return "Student{name='" + name +
                "', id=" + id +
                ", yearofstudy=" + yearOfStudy + "}";
    }
    
}
