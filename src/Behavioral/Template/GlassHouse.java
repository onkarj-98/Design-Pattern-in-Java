package Behavioral.Template;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building walls with Glass");
    }

    @Override
    public void buildPillars() {
        System.out.println("building pillars with Glass");
    }
}
