package Adapter;

public class DuckAdapter implements ITurkey {
    IDuck duck;
    public DuckAdapter(IDuck duck){
        this.duck = duck;
    }
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
