package flowershop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP);
        flower.setPrice(5);
        flower.setSepalLenght(6.4);
    }

    @Test
    void getPrice() {
        assertEquals(5, flower.getPrice());
    }

    @Test
    void getSepalLenght() {
        assertEquals(6.4, flower.getSepalLenght());
    }

    @Test
    void testToString() {
        assertEquals(flower.toString(), "Flower(price=5.0, sepalLenght=6.4, color=null, flowerType=TULIP)");
    }
}