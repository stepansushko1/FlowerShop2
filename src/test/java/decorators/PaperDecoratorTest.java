package decorators;

import flowershop.Flower;
import flowershop.FlowerBucket;
import flowershop.FlowerType;
import flowershop.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    private Flower flower;
    private Item bucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(55);
        ((FlowerBucket) bucket).addFlower((Flower) flower);
        bucket = new PaperDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(68, bucket.getPrice());
    }
}