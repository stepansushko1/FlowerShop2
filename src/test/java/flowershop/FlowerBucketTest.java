package flowershop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket = new FlowerBucket();
    private Flower flower = new Flower(FlowerType.ROSE);

    @BeforeEach
    void setUp() {
        flower.setPrice(5);
        System.out.println(flower);

        for (int i = 0; i < 5; i++)
            flowerBucket.addFlower(flower);
    }

    @Test
    void getPrice() {
        assertEquals(25, flowerBucket.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("FlowerBucket(bucketOfFlowers=[Flower(price=5.0, sepalLenght=0.0, color=null, flowerType=ROSE), Flower(price=5.0, sepalLenght=0.0, color=null, flowerType=ROSE), Flower(price=5.0, sepalLenght=0.0, color=null, flowerType=ROSE), Flower(price=5.0, sepalLenght=0.0, color=null, flowerType=ROSE), Flower(price=5.0, sepalLenght=0.0, color=null, flowerType=ROSE)])", flowerBucket.toString());
    }
}