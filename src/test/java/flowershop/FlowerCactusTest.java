package flowershop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerCactusTest {
    private FlowerCactus cactus;
    private Flower flower;

    @BeforeEach
    void setUp() {
        cactus = new FlowerCactus(FlowerType.CACTUS);
        cactus.setSepalLenght(5.4);
        cactus.setPrice(55);
        flower = new Flower(FlowerType.CACTUS);
    }

    @Test
    void getPrice() {
        assertEquals(55, cactus.getPrice());
    }

    @Test
    void getSepalLenght() {
        assertEquals(5.4, cactus.getSepalLenght());
    }

    @Test
    void getFlowerType() {
        assertEquals(flower.getFlowerType(), cactus.getFlowerType());
    }

    @Test
    void testToString() {
        assertEquals("FlowerCactus(price=55.0, sepalLenght=5.4, color=null, flowerType=CACTUS)", cactus.toString());
    }
}