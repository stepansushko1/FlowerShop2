package delivery;

import flowershop.Flower;
import flowershop.FlowerType;
import flowershop.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    private DHLDeliveryStrategy deliver = new DHLDeliveryStrategy();
    private List<Item> buckets = new ArrayList<>();
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        buckets.add(flower);
    }

    @Test
    void delivery() {
        assertEquals("Your order will be soon delivered by DHL", deliver.delivery(buckets));
    }
}