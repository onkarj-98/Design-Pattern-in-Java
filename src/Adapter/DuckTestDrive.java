package Adapter;

public class DuckTestDrive {
    public static void main(String [] args){
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        IDuck turkeyAdapter = new TurkeyAdapter(turkey);
        ITurkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        duck.quack();
        duck.quack();
        duck.fly();

        System.out.println("\nThe turkey adapter says...");
        turkeyAdapter.quack(); // adapter gobble when quack() is called
        turkeyAdapter.fly(); // it flies when fly() is called

        System.out.println("The duck adapter says...");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
