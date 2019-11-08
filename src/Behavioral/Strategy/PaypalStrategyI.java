package Behavioral.Strategy;

public class PaypalStrategyI implements IPaymentStrategy {
    private String emailId;
    private String password;
    public PaypalStrategyI(String emailId, String password){
        this.emailId = emailId;
        this.password = password;
    }
    @Override
    public void pay(int ammount) {
        System.out.println("amount:"+ammount + "\t Paid using Paypal.");
    }
}
