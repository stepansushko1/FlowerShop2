import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import flowershop.*;
import order.Order;

public class Main {

    public static void main(String[] args){
        FlowerCactus cact = new FlowerCactus(FlowerType.CACTUS);
        Flower flower1 = new Flower(FlowerType.ROSE);

        flower1.setPrice(5);
        flower1.setSepalLenght(6);

        cact.setPrice(6);
        cact.setSepalLenght(6);

        Item bucket = new FlowerBucket();
        ((FlowerBucket) bucket).addFlower(flower1);

        bucket = new PaperDecorator(bucket);
        System.out.println(bucket.getPrice());


    }

}
