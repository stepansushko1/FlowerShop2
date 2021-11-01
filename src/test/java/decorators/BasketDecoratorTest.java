package decorators;

import flowershop.Flower;
import flowershop.FlowerBucket;
import flowershop.FlowerType;
import flowershop.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    private Flower flower;
    private Item bucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(55);
        ((FlowerBucket) bucket).addFlower((Flower) flower);
        bucket = new BasketDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(59, bucket.getPrice());
    }
}