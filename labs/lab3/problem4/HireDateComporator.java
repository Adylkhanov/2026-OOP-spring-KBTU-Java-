package labs.lab3.problem4;

import java.util.Comparator;

public class HireDateComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDateOfHire().compareTo(e2.getDateOfHire());
    }
    
}
