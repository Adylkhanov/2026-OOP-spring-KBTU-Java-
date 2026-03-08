package labs.lab2.Problem1.PartB;

public class Dvd extends Libraryitem {
    private int duration;

    public Dvd(String title, String author, int publicationYear, int duration) {
        super(title, author, publicationYear);
        this.duration = duration;
    }

    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}

    @Override
    public String toString() { return super.toString() + "\nDuration: " + duration + " minutes";}

    
} 
    

