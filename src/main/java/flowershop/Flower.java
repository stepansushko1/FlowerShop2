package flowershop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Arrays;

@Setter @Getter @ToString
public class Flower implements Item{

    private double price;
    private double sepalLenght;
    private int[] color;
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flType) {
        this.flowerType = flType;
    }

    @Override
    public String getDesription() {
        return this.toString();
    }

}
