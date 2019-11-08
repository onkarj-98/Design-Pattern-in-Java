package Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //List of items
    List<Item> items;// we store objects of item class in this list
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items)
        {
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(IPaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
