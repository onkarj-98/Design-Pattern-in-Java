package Behavioral.Template;

public class WoodenHouse extends HouseTemplate {
    public void buildWalls(){
        System.out.println("Building wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with wood");
    }
}
