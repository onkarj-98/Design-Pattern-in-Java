package FactoryMethod;
// This is contract class we define the contract here
public abstract class Plan {
    protected double rate;
    abstract void getRate();
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
