package order;

import delivery.Delivery;
import flowershop.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class QuickOrder{
    private List<Item> buckets = new ArrayList<>();

    public class FastOrderConstructor {
        public Order create(List<Item> items, Payment payment, Delivery delivery) {
            return new Order();
        }
    }

    @Override
    public String toString() {
        return "You made QuickOrder";
    }
}