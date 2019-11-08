package FactoryMethod;

public class Commercial extends Plan {
    @Override
    void getRate() {
        rate = 7.50;
    }
}
