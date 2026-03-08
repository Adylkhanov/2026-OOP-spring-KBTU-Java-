package labs.lab2.Problem4;

public class Series extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potenitalDifference;

    public Series(Circuit a, Circuit b){
        c1 = a;
        c2 = b;
    }

    public double getResistance(){
        return c1.getResistance() + c2.getResistance();
    }

    public double getPotentialDiff() {
        return potenitalDifference;
    }

    public void applyPotentialDiff(double V) {

        potenitalDifference = V;

        double totalR = getResistance();

        double V1 = V * (c1.getResistance() / totalR);
        double V2 = V * (c2.getResistance() / totalR);

        c1.applyPotentialDiff(V1);
        c2.applyPotentialDiff(V2);
    }

    
}
