package Behavioral.Template;

public abstract class HouseTemplate {
    public final void buildHouse(){  // template method , final so subclass cant override
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }
    // default implementation
    private  void buildWindows(){
        System.out.println("Building glass windows");
    }
    // methods be implemented by subclass
    public abstract void buildWalls();
    public abstract void buildPillars();
    private void buildFoundation(){
        System.out.println("Building foundation with iron rods, sand , cement ");
    }
}
