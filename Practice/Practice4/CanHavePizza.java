package Practice.Practice4;


interface CanHavePizza {
    int PIZZASIZE = 30; 
    void eatPizza();    
}

interface Movable {
    void move(); 
}

interface CanHaveParty {
    void dance(); 
}

interface CanHaveRetake {
    void studyHard(); 
}


interface Sellable {}
interface Pluggable {}
interface SellableAndPluggable extends Sellable, Pluggable {}