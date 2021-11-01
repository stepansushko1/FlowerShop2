package delivery;


import flowershop.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{

    @Override
    public String delivery(List<Item> items) {
        return "Your order will be soon delivered by Post";
    }
}
