package Behavioral.Strategy;

public class ShppingCartTest {
    public static void main(String [] args){
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("1222",980);
        Item item1 = new Item("1432",999);
        cart.addItem(item);
        cart.addItem(item1);
        //pay by paypal
        cart.pay(new PaypalStrategyI("myemail@example.com","password"));
        // pay by credit/debit card
        cart.pay(new CreditCardStrategyI("onkar jaliminche","8760345123","767","12/17"));
        // pay by COD
        cart.pay(new CashOnDelivery("onkar","105b sah nagar,solapur","413004"));
    }
}