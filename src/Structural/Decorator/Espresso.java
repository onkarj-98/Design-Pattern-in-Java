package Structural.Decorator;

public class Espresso extends Beverage { // we extend the beverage class since this is beverage.
    public Espresso(){
        description = "Espresso";  // inherited this instance from Beverage
    }
    @Override
    public double cost() {
        return 1.99;  // we need to compute the cost of an Espresso.
        // just return the cost
    }
}
