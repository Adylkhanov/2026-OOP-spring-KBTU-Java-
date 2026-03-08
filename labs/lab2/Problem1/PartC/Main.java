package labs.lab2.Problem1.PartC;

public class Main {
    public static void main(String[] args) {
        
        Dotahero hero1 = new Dotahero("Axe", "Initiator", "Strength", 700, 300);
        Dotahero hero2 = new Dotahero("Axe", "Initiator", "Strength", 700, 300);
        Pudge pudge1 = new Pudge("Pudge", "Disabler", "Strength", 800, 250, 5);
        Pudge pudge2 = new Pudge("Pudge", "Disabler", "Strength", 800, 250, 5);

        System.out.println("hero1 equals hero2: " + hero1.equals(hero2)); // true
        System.out.println("pudge1 equals pudge2: " + pudge1.equals(pudge2)); // true
        System.out.println("hero1 equals pudge1: " + hero1.equals(pudge1)); // false

        System.out.println(hero1);
        System.out.println(pudge1);
    }


    
}
