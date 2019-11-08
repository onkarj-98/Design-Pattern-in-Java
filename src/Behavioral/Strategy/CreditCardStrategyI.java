package Behavioral.Strategy;

public class CreditCardStrategyI implements IPaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    public CreditCardStrategyI(String name, String cardNumber, String cvv, String dateOfExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    @Override
    public void pay(int ammount) {
        System.out.println("amount:"+ammount +"\t Paid with credit/debit card");
    }
}
