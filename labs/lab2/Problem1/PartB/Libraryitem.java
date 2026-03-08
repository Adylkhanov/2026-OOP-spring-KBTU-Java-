package labs.lab2.Problem1.PartB;

public abstract class Libraryitem {
    private String title;
    private String author;
    private int publicationYear;

    public Libraryitem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public int getPublicationYear() {return publicationYear; }

    public void setTitle(String title) {this.title = title;}

    public void setAuthor(String author) {this.author = author;}
    
    public void setPublicationYear(int publicationYear) {this.publicationYear = publicationYear; }


    @Override 

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear;
    }
    
}
