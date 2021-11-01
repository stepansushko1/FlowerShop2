package payment;

public class PayPalPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "The price of your order " + price + " by PayPal";
    }
}