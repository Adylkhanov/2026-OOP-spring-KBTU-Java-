package labs.lab2.Problem5;

public class PhDStudent extends Person {

    private String research;
    private String major;

    public PhDStudent(String name, int age, String major , String research){
        super(name, age);
        this.major = major;
        this.research = research;
    }
    
    @Override
    public void assignPet(Animal pet){
        if (pet.getClass().getSimpleName().equals("Dog")) {
            System.out.println("PhD students are too busy for dogs!");
        } else {
            super.assignPet(pet);
        }
    }

    @Override
    public String getOccupation() {
        return "Doing research on: " + research 
                + "Studying " + major ;
    }



    
}
