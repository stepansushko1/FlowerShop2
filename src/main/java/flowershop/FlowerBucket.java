package flowershop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerBucket implements Item{

    List<Flower> bucketOfFlowers = new ArrayList<>();

    public double getPrice(){
        double bucketPrice = 0;

        for (int i = 0; i < bucketOfFlowers.size(); i++){
            bucketPrice += bucketOfFlowers.get(i).getPrice();

        }
        return bucketPrice;
    }

    public void addFlower(Flower flower){
        bucketOfFlowers.add(flower);
    }

    @Override
    public String getDesription() {
        return this.toString();
    }


}
