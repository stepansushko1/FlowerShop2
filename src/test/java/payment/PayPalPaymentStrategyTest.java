package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy pay = new PayPalPaymentStrategy();


    @Test
    void pay() {
        assertEquals("The price of your order 25.0 by PayPal", pay.pay(25.0));
    }
}