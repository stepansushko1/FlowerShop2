package flowershop;
import java.util.Arrays;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Setter @Getter @ToString
public class FlowerRomashka extends Flower{

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

    public FlowerRomashka(FlowerType flType){
        super(FlowerType.ROMASHKA);
        flType = FlowerType.ROMASHKA;
        this.flowerType = flType;
    }

}
