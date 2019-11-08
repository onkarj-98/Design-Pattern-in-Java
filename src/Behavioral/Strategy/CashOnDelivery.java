package Behavioral.Strategy;

public class CashOnDelivery implements IPaymentStrategy {

    private String name;
    private String address;
    private String pincode;
    public CashOnDelivery(String name , String address, String pincode){
        this.name = name;
        this.address = address;
        this.pincode = address;
    }
    @Override
    public void pay(int ammount) {
        System.out.println("amount: "+ammount+"\t paid in COD");
    }
}
