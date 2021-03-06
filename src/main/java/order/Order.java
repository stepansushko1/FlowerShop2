package order;

import flowershop.Item;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

import delivery.*;
import payment.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    public List<Item> buckets = new ArrayList<>();
    public List<User> users = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;


    public void setPaymentStrategy(Payment paymentStrategy){
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy){
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice(){
        double price = 0;

        for (int i = 0; i < buckets.size(); i++)
            price += buckets.get(i).getPrice();
        return price;
    }

    public void addItem(Item item){
        buckets.add(item);
    }

    public void removeItem(Item item){
        for(int i = 0; i < buckets.size(); i++)
            if(Objects.equals(buckets.get(i), item) == true)
                buckets.remove(i);
    }

    public void processOrder(){
        double price = calculateTotalPrice();
        System.out.println("Your order is processing now!");
        System.out.println("Total price is: " + price);
        System.out.println("You choose: " + payment.pay(price));
        System.out.println("You choose: " + delivery.delivery(buckets));
    }

    public void addUser(User newUser){
        users.add(newUser);
    }

    public void removeUser(User delUser){
        for (int i = 0; i < users.size(); i++){
            if (Objects.equals(users.get(i), delUser))
                buckets.remove(i);
        }
    }

    public void notifyUsers(){
        for (int i = 0; i < users.size(); i++){
            users.get(i).update("Your order is ready!");
        }
    }

    public void order(){
        processOrder();
        notifyUsers();
    }


}
