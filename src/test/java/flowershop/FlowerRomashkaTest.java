package flowershop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerRomashkaTest {
    private FlowerRomashka rom;
    private Flower flower;

    @BeforeEach
    void setUp() {
        rom = new FlowerRomashka(FlowerType.ROMASHKA);
        rom.setSepalLenght(6.5);
        rom.setPrice(15);
        flower = new Flower(FlowerType.ROMASHKA);
    }

    @Test
    void getPrice() {
        assertEquals(15, rom.getPrice());
    }

    @Test
    void getSepalLenght() {
        assertEquals(6.5, rom.getSepalLenght());
    }

    @Test
    void getFlowerType() {
        assertEquals(flower.getFlowerType(), rom.getFlowerType());
    }

    @Test
    void testToString() {
        assertEquals("FlowerRomashka(price=15.0, sepalLenght=6.5, color=null, flowerType=ROMASHKA)", rom.toString());
    }
}