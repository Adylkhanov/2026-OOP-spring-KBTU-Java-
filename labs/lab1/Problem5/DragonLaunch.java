package labs.lab1.Problem5;

import java.util.Vector;



public class DragonLaunch{


    private Vector<Person> kidpeople;

    public DragonLaunch() {
        kidpeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidpeople.add(p);
    }


     public boolean willDragonEatOrNot() {
        int top = 0; 

        for (int i = 0; i < kidpeople.size(); i++) {
            Person cur = kidpeople.get(i);

            if (top > 0) {
                Person prev =kidpeople.get(top - 1);

                
                if (prev.getGender() == Gender.BOY && cur.getGender() == Gender.GIRL) {
                    top--;
                    continue;
                }
            }

            
        kidpeople.set(top, cur);
            top++;
        }

        kidpeople.setSize(top);
        return top != 0;
    }

    public String toString() {
        return kidpeople.toString();
    }
}