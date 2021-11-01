package delivery;

import flowershop.Item;
import java.util.List;

public interface Delivery {
    public String delivery(List<Item> items);
}