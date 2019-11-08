package Structural.Decorator;



public class StarBuzzTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(); // order espresso, no condiments and print its description and cost
        System.out.println(beverage.getDescription() + "\t$"+beverage.cost());

        // making new beverage
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "\t$"+ beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()+"\t$"+beverage3.cost());

        Beverage beverage4 = new DarkRoast();

    }
}
