package delivery;


import flowershop.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{

    @Override
    public String delivery(List<Item> items) {
        return "Your order will be soon delivered by DHL";
    }
}
