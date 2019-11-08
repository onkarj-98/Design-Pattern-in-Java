package FactoryMethod;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new Domestic();
        }
        else if(planType.equalsIgnoreCase("COMMERCIAL")){
            return  new Commercial();
        }
        else if(planType.equalsIgnoreCase("INSTITUTION")){
            return new Institution();
        }
        return null;
    }
}
