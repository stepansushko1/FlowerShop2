package flowershop;
import java.util.Arrays;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Setter @Getter @ToString
public class FlowerCactus extends Flower{

    private double price;
    private double sepalLenght;
    private int[] color;
    private FlowerType flowerType;

    public double getPrice() {
        return this.price;
    }

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length );
    }

    public FlowerCactus(FlowerType flType){
        super(FlowerType.CACTUS);
        flType = FlowerType.CACTUS;
        this.flowerType = flType;
    }

}