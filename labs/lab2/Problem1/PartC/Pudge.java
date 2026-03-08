package labs.lab2.Problem1.PartC;

import java.util.Objects;

public class Pudge extends Dotahero {

    private int fleshHeapStacks;

    public Pudge(String name, String role, String primaryAttribute, int baseHealth, int baseMana, int fleshHeapStacks) {
        super(name, role, primaryAttribute, baseHealth, baseMana);
        this.fleshHeapStacks = fleshHeapStacks;
    }

    public int getFleshHeapStacks() {
        return fleshHeapStacks;
    }

    public void setFleshHeapStacks(int fleshHeapStacks) {
        this.fleshHeapStacks = fleshHeapStacks;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {return false;};
        Pudge pudge = (Pudge) o;
        return fleshHeapStacks == pudge.fleshHeapStacks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fleshHeapStacks);
    }

    @Override
    public String toString() {
        return super.toString() + " | Pudge gots stacks: " + fleshHeapStacks;
    }

    
}
