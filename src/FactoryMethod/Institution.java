package FactoryMethod;

public class Institution extends Plan {
    @Override
    void getRate() {
        rate = 5.50;
    }
}
