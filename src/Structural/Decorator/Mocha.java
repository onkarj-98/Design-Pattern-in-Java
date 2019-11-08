package Structural.Decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;  // An instance variable to hold the beverage we are wrapping
    public Mocha(Beverage beverage){
        this.beverage = beverage;  // instantiate with current means wrap around the previous object
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() +", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
