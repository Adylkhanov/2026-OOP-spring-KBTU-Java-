package labs.lab1.Problem4;



public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisites; 

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getCredits() { return credits; }
    public String getPrerequisites() { return prerequisites; }

    @Override
    public String toString() {
        return "Course{name='" + name + "', credits=" + credits +
                ", description='" + description + "', prerequisites='" + prerequisites + "'}";
    }
}
