package labs.lab1.Problem5;

public class Main {

     public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person(Gender.BOY, "B1"));
        dl.kidnap(new Person(Gender.BOY, "B2"));
        dl.kidnap(new Person(Gender.GIRL, "G1"));
        dl.kidnap(new Person(Gender.GIRL, "G2"));

        System.out.println("Before: " + dl);
        System.out.println("Dragon eats? " + dl.willDragonEatOrNot());
        System.out.println("After:  " + dl);
    }
    
}
