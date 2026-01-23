import java.util.Scanner;
public static void main(String[] args) {

    Scanner scanne = new Scanner(System.in);

    int a = scanne.nextInt();

    int s = a * a;
    int p = 4 * a;
    int d = (int) Math.sqrt(2 * s);
    System.out.println("Square side: " + a);
    System.out.println("Area: " + s);
    System.out.println("Perimeter: " + p);
    System.out.println("Diagonal: " + d);


    scanne.close();
    

}