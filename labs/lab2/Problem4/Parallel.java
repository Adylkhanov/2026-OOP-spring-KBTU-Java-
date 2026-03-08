package labs.lab2.Problem4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potentialDifference;

    public Parallel(Circuit a, Circuit b) {
        c1 = a;
        c2 = b;
    }

    public double getResistance() {
        return 1 / ( (1 / c1.getResistance()) + (1 / c2.getResistance()) );
    }

    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void applyPotentialDiff(double V) {

        potentialDifference = V;

        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}