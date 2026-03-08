package labs.lab2.Problem4;

public class Main {
    public static void main(String[] args) {

        Circuit r1 = new Resistor(6);
        Circuit r2 = new Resistor(3);
        Circuit r3 = new Resistor(2);
        Circuit r4 = new Resistor(3);
        Circuit r5 = new Resistor(3);

        Circuit topParallel = new Parallel(r1, r2);
        Circuit topSeries = new Series(topParallel, r3);
        Circuit bottomSeries = new Series(r4, r5);

        Circuit wholeCircuit = new Parallel(topSeries, bottomSeries);

        wholeCircuit.applyPotentialDiff(12);

        System.out.println("Equivalent Resistance: " + wholeCircuit.getResistance());
        System.out.println("Current: " + wholeCircuit.getCurrent());
        System.out.println("Power: " + wholeCircuit.getPower());
    }
}