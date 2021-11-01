package payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "The price of your order " + price + " by Credit Card";
    }
}