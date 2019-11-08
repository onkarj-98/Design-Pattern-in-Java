package FactoryMethod;

public class Domestic extends Plan {

    @Override
    void getRate() {
        rate = 3.50;
    }
}
