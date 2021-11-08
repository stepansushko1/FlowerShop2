package order;

import flowershop.FlowerCactus;
import flowershop.Flower;
import flowershop.FlowerType;
import flowershop.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order;
    @BeforeEach
    void setUp(){
        order = new Order();
        Flower flower1 = new Flower(FlowerType.ROSE);
    }


    @Test
    void addItem() {
        Item item1 = new FlowerCactus(FlowerType.CACTUS);
        order.addItem(item1);
        assertEquals(1,order.buckets.size());
    }

    @Test
    void removeItem() {
        Item item1 = new FlowerCactus(FlowerType.CACTUS);
        order.addItem(item1);
        order.removeItem(item1);
        assertEquals(0,order.buckets.size());
    }

    @Test
    void addUser() {
        User sender = new Sender();
        order.addUser(sender);
        assertEquals(1,order.users.size());


    }

}